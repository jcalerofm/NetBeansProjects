package interftrimestre1;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class ListaClientes extends JFrame {

  public static String nombre;
  public static String idc;
  public static String address;
  JTable tablaclientes = new JTable();
  JButton boton = new JButton("Ver detalles del cliente");
  JButton botonvolver = new JButton("Volver a lista de clientes");
  JButton botonPdf = new JButton("Exportar a PDF");

  public ListaClientes() {
    setLayout(null);
    setIconImage(getIconImage());
    setSize(590, 460);

    boton.setBounds(40, 350, 200, 30);
    add(boton);
    setLocationRelativeTo(null);
    consultaSQL();
    setVisible(true);

    // Evento para cargar los datos de facturas asociadas a un cliente con un id
    // determinado seleccionado en la tabla
    boton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        int id = Integer.parseInt(tablaclientes.getValueAt(tablaclientes.getSelectedRow(), 0).toString());
        leerdatos();
        cargarFacturas(id);

      }
    });

  }

  public static void main(String[] args) {
    ListaClientes miVentana = new ListaClientes();
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  // Método para cargar cargar los datos de facturas asociadas a un cliente con un
  // id determinado seleccionado en la tabla
  public void cargarFacturas(int id) {
    try {
      MostrarInfoCliente miVentana = new MostrarInfoCliente();
      // llamamos a la clase Conexion para conectarnos a la BB.DD.
      Connection cn = Conexion.conectar();
      PreparedStatement pst = cn.prepareStatement("select * from facturas where id_cliente = ?"); // a la conexion
                                                                                                  // creada le
                                                                                                  // preparamos una
                                                                                                  // consulta SQL
      pst.setInt(1, id);
      ResultSet rs = pst.executeQuery(); // Ejecutamos la consulta
      
      //ELEMENTOS NECESARIOS PARA CREAR UNA TABLA
      DefaultTableModel model = new DefaultTableModel();
      JTable jTable = new JTable(model);
      JScrollPane jScrollPane = new JScrollPane(jTable);
      
      jScrollPane.setBounds(40, 180, 450, 80);
      add(jScrollPane);
      model.addColumn("Id Factura");
      model.addColumn("Id Cliente");
      model.addColumn("Fecha");
      model.addColumn("Importe a pagar");
      // add button botonPDF a miVentana

      // añadir toda esta info a miVentana
      miVentana.add(jScrollPane);
      miVentana.setVisible(true);

      while (rs.next()) {
        Object[] fila = new Object[4];
        for (int i = 0; i < 4; i++) {
          fila[i] = rs.getObject(i + 1);
        }
        model.addRow(fila);
      }

      cn.close();

    } catch (SQLException e) {
      System.err.println("Error al cargar la tabla facturas " + e);
      JOptionPane.showMessageDialog(null,
          "¡¡¡Error al cargar las facturas de la BB.DD.!!!, contacte con el administrador");
    }
  }

  public void leerdatos() {
    nombre = tablaclientes.getValueAt(tablaclientes.getSelectedRow(), 1).toString();
    idc = tablaclientes.getValueAt(tablaclientes.getSelectedRow(), 0).toString();
    address = tablaclientes.getValueAt(tablaclientes.getSelectedRow(), 2).toString();
  }
  
  public void consultaSQL() {
    try {
      // llamamos a la clase Conexion para conectarnos a la BB.DD.
      Connection cn = Conexion.conectar();
      PreparedStatement pst = cn.prepareStatement("select * from clientes"); // a la conexion creada le preparamos una
                                                                             // consulta SQL
      ResultSet rs = pst.executeQuery(); // Ejecutamos la consulta
      DefaultTableModel model = new DefaultTableModel();
      tablaclientes = new JTable(model);
      JScrollPane scrollpanecliente = new JScrollPane(tablaclientes);
      scrollpanecliente.setBounds(40, 40, 450, 300);
      add(scrollpanecliente);
      model.addColumn("Id");
      model.addColumn("Nombre");
      model.addColumn("Direccion");

      while (rs.next()) {
        Object[] fila = new Object[3];
        for (int i = 0; i < 3; i++) {
          fila[i] = rs.getObject(i + 1);
        }
        model.addRow(fila);
      }
      cn.close();

    } catch (SQLException e) {
      System.err.println("Error al cargar la tabla clientes " + e);
      JOptionPane.showMessageDialog(null,
          "¡¡¡Error al cargar los clientes de la BB.DD.!!!, contacte con el administrador");
    }
  }

  @Override
  public Image getIconImage() {
    Image miIcono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/harold.jpeg"));
    return miIcono;
  }

}
