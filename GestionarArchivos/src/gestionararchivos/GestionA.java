package gestionararchivos;

import java.io.*;
/**
 *
 * @author jnieto
 */
public class GestionA {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionA(){
        
    }
    
    //método para abrir un archivo de texto
    public String AbrirArchText (File archivo){
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascii;
            while((ascii = entrada.read()) != -1){
                char caracter = (char)ascii;
                contenido += caracter;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenido;
    }
    
    //método para guardar un archivo de texto
    public String GuardarArchText (File archivo, String contenido){
        String respuesta = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] byteTxt = contenido.getBytes();
            salida.write(byteTxt);
            respuesta = "Se ha guardado correctamente el archivo";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }
    
    //método para abrir un archivo de imagen
    public byte[] AbrirArchImagen (File archivo){
        byte[] byteImg = new byte[1024*100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(byteImg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteImg;
    }
    
    //método para guardar un archivo de imagen
    public String GuardarArchImagen (File archivo, byte[] byteImg){
        String respuesta = null;
        try {
            salida = new FileOutputStream(archivo);
            salida.write(byteImg);
            respuesta = "Se ha guardado correctamente la imagen";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }
}
