
package joptionpanes;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class JOptionPanes {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] coches = {
            "Ford Fiesta",
            "Renault Clio",
            "Subaru Impreza",
            "Renault Megane",
            "Seat Alhambra",
            "Toyota Prius"
        };
        
        String resp = (String) JOptionPane.showInputDialog(null, "Indíquenos que coche quiere comprar");
        
        if (coches[0].equals(resp) || coches[1].equals(resp) || coches[2].equals(resp) || coches[3].equals(resp) || coches[4].equals(resp) || coches[5].equals(resp)){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de realizar su compra?", "Confirmacion de compra", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                JOptionPane.showMessageDialog(null, "Su pedido se ha realizado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se preocupe, no hay prisa! le preguntaremos mas tarde");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos, no hay stock del vehículo indicado", "Error. No hay Stock", JOptionPane.WARNING_MESSAGE);
        }
        
    }
}
