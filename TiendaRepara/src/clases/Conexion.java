package clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/TiendaReparacion", "root", "");
            System.out.println("Conectado con Exito");
            return cn;
        } catch (SQLException e) {
            System.err.println("Error en la conexión local " + e);
        }
        return (null);
    }

    //Crear un metodo para Registrar cliente en la base de datos con los datos nombre, apellido1, apellido2, dni, direccion, telefono, email, fecha_registro
    public static void registrarCliente(String nombre, String apellido1, String apellido2, String dni, String direccion, String telefono, String email, Date fecha_registro){
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?,?,?,?,?,?,?)");
            pst.setString(1, nombre);
            pst.setString(2, apellido1);
            pst.setString(3, apellido2);
            pst.setString(4, dni);
            pst.setString(5, direccion);
            pst.setString(6, telefono);
            pst.setString(7, email);
            pst.setDate(8, fecha_registro);
            pst.executeUpdate();
            System.out.println("Cliente registrado con exito");
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al registrar cliente " + e);
        }
    }
}
