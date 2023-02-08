package consultamedica;


import javax.swing.*;
import java.sql.*;

public class guardarenbasedatos extends JFrame {
    
    
    public static void insert (String nombre, String apellido1, String apellido2, String dni, String telefono, String num_seg_social){
        
        Connection con = ConsultaMedica.conectar();
        
        try{
            String query = "insert into pacientes values (null, '"+nombre+"', '"+apellido1+"', '"+apellido2+"', '"+dni+"', '"+telefono+"', '"+num_seg_social+"')";
            PreparedStatement preparest = con.prepareStatement(query);
            preparest.execute();
            JOptionPane.showMessageDialog(null, "Data added");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
       
    
    
    public static void main(String args[]) {

        
    }      
    
    
}
