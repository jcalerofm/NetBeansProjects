package proyectonube;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {

    public static void main(String[] args) {
        MarcoServidor mimarco = new MarcoServidor();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoServidor extends JFrame implements Runnable {
//Conexion al servidor

    public MarcoServidor() {
        //Damos los tamaños de la ventana
        setBounds(1200, 300, 280, 350);
        JPanel milamina = new JPanel();
        milamina.setLayout(new BorderLayout());
        areaTexto = new JTextArea();
        milamina.add(areaTexto, BorderLayout.CENTER);
        add(milamina);
        setVisible(true);

        //Iniciamos el hilo y antes los llamamos
        Thread miHilo = new Thread(this);
        miHilo.start();
    }

    @Override
    public void run() {
        try {
            ServerSocket servidor = new ServerSocket(9999);
            String mensaje;
            File archivo;
            PaqueteEnvio paqueteRecibido;
            //ArrayList<String> listaIp = new ArrayList<String>();


            while (true) {

                Socket miSocket = servidor.accept();
                //Abre el socket
                ObjectInputStream paquete_datos = new ObjectInputStream(miSocket.getInputStream());
                PaqueteEnvio paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();
                archivo = paquete_recibido.getArchivo();
                mensaje = paquete_recibido.getMensaje();
                areaTexto.append("Archivo " + mensaje + ", subido a la nube");
                Socket enviaDestinatario = new Socket("192.168.1.43", 9999);
                PaqueteEnvio datos = new PaqueteEnvio();
                datos.setArchivo(archivo);
                datos.setMensaje("El archivo " + mensaje + " se ha subido a la nube con exito.");
                ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
                paqueteReenvio.writeObject(datos);
                paqueteReenvio.close();
                enviaDestinatario.close();
                miSocket.close();

            }
        }catch (IOException | ClassNotFoundException ex) {
            //System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    private JTextArea areaTexto;

}

class PaqueteRecibido implements Serializable {
    private String mensaje;
    private File archivo;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}

//crea class PaqueteEnvio
class PaqueteEnvio implements Serializable {
    private String mensaje;
    private File archivo;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}

