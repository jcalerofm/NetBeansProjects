package interftrimestre1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/InterfacesBBDD", "root", "");
            System.out.println("Conectado con Exito");
            return cn;
        } catch (SQLException e) {
            System.err.println("Error en la conexión local " + e);
        }
        return(null);
    }

}