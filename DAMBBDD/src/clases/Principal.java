package clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author juana
 */
public class Principal extends JFrame{

    public Principal(){
        setLayout(null);
        setIconImage(getIconImage());
        setSize(500, 500);
        setLocationRelativeTo(null);
        consultaSQL();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Principal miVentana = new Principal();
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
            Connection cn = conectar();
            PreparedStatement pst = cn.prepareStatement("select * from alumnos");
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = new DefaultTableModel();
            JTable jTable_alumno = new JTable(model);
            JScrollPane jScrollPane_alumno = new JScrollPane(jTable_alumno);
            jScrollPane_alumno.setBounds(40, 40, 400, 200);
            add(jScrollPane_alumno);
            model.addColumn("");
            model.addColumn("Nombre");
            model.addColumn("Email");
            model.addColumn("Teléfono");
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
        Image miIcono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imgs/jnieto.png"));
        return miIcono;
    }
    
}
