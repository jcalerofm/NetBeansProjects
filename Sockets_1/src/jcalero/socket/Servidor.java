
package jcalero.socket;

import javax.swing.*;
import java.awt.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.*;

public class Servidor {

  public static void main(String[] args) {
    MarcoServidor mimarco = new MarcoServidor();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}

class MarcoServidor extends JFrame implements Runnable {

  public MarcoServidor() {

    setBounds(1200, 300, 280, 350);

    JPanel milamina = new JPanel();

    milamina.setLayout(new BorderLayout());

    areatexto = new JTextArea();

    milamina.add(areatexto, BorderLayout.CENTER);

    add(milamina);

    setVisible(true);

    // ↓↓↓↓↓↓↓ OJO, ESTO ES CLAVE! ↓↓↓↓↓↓↓↓

    // CREAMOS EL HILO
    Thread mihilo = new Thread(this);
    mihilo.start();

  }

  @Override
  public void run() {
    try {
      ServerSocket servidor = new ServerSocket(9999);
      String nick, ip, mensaje;
      ArrayList<String> listaIp = new ArrayList<String>();
      PaqueteEnvio paqueteRecibido;

      while (true) {
        Socket otroSocket = servidor.accept();

        ObjectInputStream paqueteDatos = new ObjectInputStream(otroSocket.getInputStream());
        paqueteRecibido = (PaqueteEnvio) paqueteDatos.readObject();
        nick = paqueteRecibido.getNick();
        mensaje = paqueteRecibido.getMensaje();
        ip = paqueteRecibido.getIp();

        if (!mensaje.equals(" online")) {
          areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);

          Socket enviaDestino = new Socket(ip, 9999);
          ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestino.getOutputStream());
          paqueteReenvio.writeObject(paqueteRecibido);
          paqueteReenvio.close();
          enviaDestino.close();
          otroSocket.close();
        } else {
          InetAddress localizacion = otroSocket.getInetAddress();
          String ipRemota = localizacion.getHostAddress();
          System.out.println("Online: " + ipRemota);

          listaIp.add(ipRemota);
          paqueteRecibido.setIps(listaIp);
          for (String z : listaIp) {
            Socket enviaDestinatario = new Socket(z, 9999);
            ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
            paqueteReenvio.writeObject(paqueteRecibido);
            paqueteReenvio.close();
            enviaDestinatario.close();
            otroSocket.close();
          }
        }
      }
    } catch (IOException | ClassNotFoundException e) {
      System.err.println(e.getMessage()); // PONER SIEMPRE EL err EN LUGAR DEL out
    }
  }

  private JTextArea areatexto;
}
