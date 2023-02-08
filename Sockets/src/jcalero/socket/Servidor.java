
package jcalero.socket;

import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;

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
    
    //CREAMOS EL HILO
    Thread mihilo = new Thread(this);
    mihilo.start();
  }

  @Override
  public void run() {
    try {
        ServerSocket servidor = new ServerSocket(9999); 
        while (true) {
          Socket otrosocket = servidor.accept();
          DataInputStream flujoentrada = new DataInputStream(otrosocket.getInputStream());
          String mensajeRec = flujoentrada.readUTF();
          areatexto.append("\n" + mensajeRec);
          otrosocket.close();
        }
      
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private JTextArea areatexto;
}
