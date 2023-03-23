package clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;
import java.sql.Date;

import javax.swing.JOptionPane;

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
    public static void registrarCliente(String nombre, String primer_apellido, String segundo_apellido, String dni, String direccion, int telefono, String email, Date fecha_registro){


        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into clientes (nombre, primer_apellido, segundo_apellido, dni, direccion, telefono, email, fecha_registro) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, nombre);
            pst.setString(2, primer_apellido);
            pst.setString(3, segundo_apellido);
            pst.setString(4, dni);
            pst.setString(5, direccion);
            pst.setInt(6, telefono);
            pst.setString(7, email);
            pst.setDate(8, fecha_registro);


            pst.executeUpdate();
            System.out.println("Cliente registrado con exito");
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al registrar cliente " + e);
        }
    }


    public static void buscarCliente(String dni, JTextField tfNombre, JTextField tfApellido1, JTextField tfApellido2,
        JTextField tfDireccion, JTextField tfTelefono, JTextField tfEmail) {
      try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("select * from clientes where dni = ?");
        pst.setString(1, dni);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
          tfNombre.setText(rs.getString("nombre"));
          tfApellido1.setText(rs.getString("primer_apellido"));
          tfApellido2.setText(rs.getString("segundo_apellido"));
          tfDireccion.setText(rs.getString("direccion"));
          tfTelefono.setText(String.valueOf(rs.getInt("telefono")));
          tfEmail.setText(rs.getString("email"));
          JOptionPane.showMessageDialog(null, "Cliente encontrado");
        } else {
          JOptionPane.showMessageDialog(null, "Cliente no existe");
        }
        cn.close();
      } catch (SQLException e) {
        System.err.println("Error al buscar cliente, debe introducir DNI " + e);
        JOptionPane.showMessageDialog(null, "Error al buscar cliente, debe introducir DNI ");
      }
    }

    public static void modifCliente(String nombre, String primer_apellido, String segundo_apellido, String dni, String direccion, int telefono, String email, Date fecha_registro){
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("update clientes set nombre = ?, primer_apellido = ?, segundo_apellido = ?, direccion = ?, telefono = ?, email = ?, fecha_registro = ? where dni = ?");
            pst.setString(1, nombre);
            pst.setString(2, primer_apellido);
            pst.setString(3, segundo_apellido);
            pst.setString(4, direccion);
            pst.setInt(5, telefono);
            pst.setString(6, email);
            pst.setDate(7, fecha_registro);
            pst.setString(8, dni);

            pst.executeUpdate();
            System.out.println("Cliente modificado con exito");
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al modificar cliente " + e);
        }
    }

    public static void eliminarCliente(String dni){
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("delete from clientes where dni = ?");
            pst.setString(1, dni);

            pst.executeUpdate();
            System.out.println("Cliente eliminado con exito");
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al eliminar cliente " + e);
        }
    }

}
