package jcalero.socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.*;

public class Cliente {
  public static void main(String[] args) {

    MarcoCliente mimarco = new MarcoCliente();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class MarcoCliente extends JFrame {
  public MarcoCliente() {
    setBounds(600, 300, 280, 350);
    LaminaMarcoCliente milamina = new LaminaMarcoCliente();
    add(milamina);
    setVisible(true);
    addWindowListener(new EnvioOnline());
  }
}

class EnvioOnline extends WindowAdapter {

    @Override
    public void windowOpened(WindowEvent e){
        try{
            Socket miSocket = new Socket("192.168.1.56", 9999);
            PaqueteEnvio datos = new PaqueteEnvio();
            datos.setMensaje(" online");
            ObjectOutputStream paqueteDatos = new ObjectOutputStream(miSocket.getOutputStream());
            paqueteDatos.writeObject(datos);
            miSocket.close();
        }catch (Exception e2){
            System.out.println(e2.getMessage());
        }
    }
}




class LaminaMarcoCliente extends JPanel implements Runnable{
  public LaminaMarcoCliente() {

    String nickUsuario = JOptionPane.showInputDialog("Nick: ");
    JLabel nNick = new JLabel("Nick: ");
    add(nNick);
    nick = new JLabel(nickUsuario);
    add(nick);
    JLabel texto = new JLabel("- Online");
    add(texto);

    ip = new JComboBox();

    add(ip);
    //Creamos el campoChat
    campoChat = new JTextArea(12,20);
    add(campoChat);
    campo1 = new JTextField(20);
    add(campo1);
    miboton = new JButton("Enviar");
    EnviaTexto mievento = new EnviaTexto();
    miboton.addActionListener(mievento);
    add(miboton);
    Thread miHilo = new Thread(this);
    miHilo.start();
  }

  @Override
  public void run(){
      try {
          ServerSocket servidorCliente = new ServerSocket(9090);
          Socket cliente;
          PaqueteEnvio paqueteRecibido;
          while(true) {
              cliente = servidorCliente.accept();
              ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
              paqueteRecibido = (PaqueteEnvio) flujoEntrada.readObject();

              if(!paqueteRecibido.getMensaje().equals(" online")) {
                  campoChat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());
              }else{
                  ArrayList<String> IpsMenu = new ArrayList<String>();
                  IpsMenu = paqueteRecibido.getIps();
                  ip.removeAllItems();
                  for(String z: IpsMenu){
                      ip.addItem(z);
                  }
              }
              flujoEntrada.close();
              cliente.close();
          }
      }catch (IOException | ClassNotFoundException e){
          System.err.println("Error al recibir en el cliente. " + e.getMessage());

      }
  }

  private class EnviaTexto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        campoChat.append("\nYo:\n" + campo1.getText());
      try {
        Socket misocket = new Socket("192.168.1.56", 9999);
        PaqueteEnvio datos = new PaqueteEnvio();
        datos.setNick(nick.getText());
        datos.setIp(ip.getSelectedItem().toString());
        datos.setMensaje(campo1.getText());

        // tenemos que construir los flujos de salida
        ObjectOutputStream paqueteDatos = new ObjectOutputStream(misocket.getOutputStream());
        paqueteDatos.writeObject(datos);
        // le tenemos que decir que tiene que ciercular en este flujo

        // ↓↓↓↓↓↓↓↓↓↓ OJO PREGUNTA DE EXAMEN!!!! ↓↓↓↓↓↓↓↓↓

//        flujosalida.writeUTF(campo1.getText()); // Utilizamos el metodo writeUTF para enviar el texto PORQUE NO SERIALIZAMOS
//        flujosalida.close(); // Nos vamos a servidor
        misocket.close();
      } catch (IOException ex) {
        System.err.println(ex.getMessage());
      }
    }
  }

  private JTextArea campoChat;
  private JTextField campo1;
  private JLabel nick;
  private JComboBox ip;
  private JButton miboton;
}




// PARA PODER ENVIAR EN UN SOLO MENSAJE LOS DATOS DE MENSAJE, NICK e IP, VAMOS A SERIALIZARLO CREANDO UNA CLASE PARA PAQUETEENVIO
class PaqueteEnvio implements Serializable {

    private String nick;
    private String ip;
    private String mensaje;
    private ArrayList<String> ips;

    public PaqueteEnvio(){

    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<String> getIps() {
        return ips;
    }

    public void setIps(ArrayList<String> ips) {
        this.ips = ips;
    }
}
