

package recepcion;

import clases.Conexion;

public class TiendaRepara {


    public static void main(String[] args) {
        System.out.println(Conexion.conectar());
        MenuClientes menuClientes = new MenuClientes();
        menuClientes.setVisible(true);
        menuClientes.setLocationRelativeTo(null);
    }

}
