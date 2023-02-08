package clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


public class tablaalumnos extends JFrame{

    public tablaalumnos(){
        setLayout(null);
        setIconImage(getIconImage());
        setSize(600, 600);
        setLocationRelativeTo(null);
        consultaSQL();
        setVisible(true);
    }

    public static void main(String[] args) {
        tablaalumnos miVentana = new tablaalumnos();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/AlumnosDam", "root", "");
            System.out.println("Conectado con Exito");
            return cn;
        } catch (SQLException e) {
            System.err.println("Error en la conexión local " + e);
        }
        return (null);
    }

    public void consultaSQL(){
        try {
            Connection cn = conectar(); // Creamos variable para conexion
            PreparedStatement pst = cn.prepareStatement("select * from alumnos"); //a la conexion creada le preparamos una consulta SQL
            ResultSet rs = pst.executeQuery(); //Ejecutamos la consulta
            DefaultTableModel model = new DefaultTableModel();
            JTable jTable_alumno = new JTable(model);
            JScrollPane jScrollPane_alumno = new JScrollPane(jTable_alumno);
            jScrollPane_alumno.setBounds(40, 40, 500, 300);
            add(jScrollPane_alumno);
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Email");
            model.addColumn("Telefono");
            while (rs.next()) {
                Object[] fila = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al cargar la tabla alumnos " + e);
            JOptionPane.showMessageDialog(null, "¡¡¡Error al cargar los alumnos de la BB.DD.!!!, contacte con el administrador");
        }
    }

    @Override
    public Image getIconImage(){
        Image miIcono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imgs/coding.jpeg"));
        return miIcono;
    }

}
