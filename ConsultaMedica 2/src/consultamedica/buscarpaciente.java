
package consultamedica;


import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


public class buscarpaciente extends JFrame{
    
    
    
    public static void buscar(String nombre, String apellido1){
        
        
        Connection con = ConsultaMedica.conectar();
        try{
            String query = "select * from pacientes where nombre = '"+nombre+"' and apellido1 = '"+apellido1+"'";
            PreparedStatement preparest = con.prepareStatement(query);
            ResultSet rs = preparest.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Paciente encontrado");
                DefaultTableModel model = new DefaultTableModel();
                JTable jTable_paciente = new JTable(model);
                JScrollPane jScrollPane_paciente = new JScrollPane(jTable_paciente);
                jScrollPane_paciente.setBounds(40, 40, 600, 400);
//                add(jScrollPane_paciente);
                model.addColumn("Id");
                model.addColumn("Nombre");
                model.addColumn("Apellido1");
                model.addColumn("Apellido2");
                model.addColumn("DNI");
                model.addColumn("Telefono");
                model.addColumn("Num.Seg.Social");
                while (rs.next()) {
                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    model.addRow(fila);
                }
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
//        String[] coches = {
//            "Ford Fiesta",
//            "Renault Clio",
//            "Subaru Impreza",
//            "Renault Megane",
//            "Seat Alhambra",
//            "Toyota Prius"
//        };
//        
//        String nombre = (String) JOptionPane.showInputDialog(null, "Indíquenos nombre del paciente");
//        
//        if (coches[0].equals(resp) || coches[1].equals(resp) || coches[2].equals(resp) || coches[3].equals(resp) || coches[4].equals(resp) || coches[5].equals(resp)){
//            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de realizar su compra?", "Confirmacion de compra", JOptionPane.YES_NO_OPTION);
//            if (respuesta == 0) {
//                JOptionPane.showMessageDialog(null, "Su pedido se ha realizado correctamente");
//            }else{
//                JOptionPane.showMessageDialog(null, "No se preocupe, no hay prisa! le preguntaremos mas tarde");
//            }
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "Lo sentimos, no hay stock del vehículo indicado", "Error. No hay Stock", JOptionPane.WARNING_MESSAGE);
//        }
//        
    }
    
    
 
//    private static void add(JScrollPane jScrollPane_paciente) {
//        
//    }
    
}
