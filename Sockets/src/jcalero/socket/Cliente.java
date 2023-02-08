package jcalero.socket;

import java.io.*;
import java.net.*;
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
  }
}

class LaminaMarcoCliente extends JPanel {
  public LaminaMarcoCliente() {
    JLabel texto = new JLabel("CLIENTE");
    add(texto);
    campo1 = new JTextField(20);
    add(campo1);
    miboton = new JButton("Enviar");
    EnviaTexto mievento = new EnviaTexto();
    miboton.addActionListener(mievento);
    add(miboton);
  }

  private class EnviaTexto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      try {
        Socket misocket = new Socket("192.168.1.166", 9999);
        // tenemos que construir los flujos de salida
        DataOutputStream flujosalida = new DataOutputStream(misocket.getOutputStream());
        // le tenemos que decir que tiene que circular en este flujo

        // ↓↓↓↓↓↓↓↓↓↓ OJO PREGUNTA DE EXAMEN!!!! ↓↓↓↓↓↓↓↓↓

        flujosalida.writeUTF(campo1.getText()); // Utilizamos el metodo writeUTF para enviar el texto PORQUE NO SERIALIZAMOS
        flujosalida.close(); // Nos vamos a servidor
        misocket.close();
      } catch (IOException ex) {
        System.err.println(ex.getMessage());
      }
    }
  }

  private JTextField campo1;
  private JButton miboton;
}
