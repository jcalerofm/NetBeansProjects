
package interftrimestre1;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MostrarInfoCliente extends javax.swing.JFrame {

  String nomCliente;
  String id_Cliente;
  String dirCliente;
  JButton btnPdf = new JButton("Generar PDF");

  public MostrarInfoCliente() {
    initComponents();
    nomCliente = ListaClientes.nombre;
    id_Cliente = ListaClientes.idc;
    dirCliente = ListaClientes.address;

    nombrecliente.setText(nomCliente);
    idcliente.setText(id_Cliente);
    direccioncliente.setText(dirCliente);
    setLocationRelativeTo(null);
    setLayout(null);
    btnPdf.setBounds(40, 270, 100, 30);
    add(btnPdf);
    //ActionListener para el boton btnPdf 
    btnPdf.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          try {
            Pdf(Integer.parseInt(id_Cliente));
          } catch (FileNotFoundException ex) {
            Logger.getLogger(MostrarInfoCliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (BadElementException ex) {
            Logger.getLogger(MostrarInfoCliente.class.getName()).log(Level.SEVERE, null, ex);
          }
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
    });

  }

  public void Pdf(int id) throws FileNotFoundException, BadElementException, IOException {

    Document documento = new Document();
    String idCli = Integer.toString(id);

    try {
      // Creamos ruya y archivo PDF
      String ruta = System.getProperty("user.home");
      PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Informe.pdf"));

      // Creo la cabecera y estructura de los parrafos
      // Como en este caso la clase Image esta utilizada desde otro impor no se puede
      // utilizar directamente
      com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/imagenes/banner.jpg");
      header.scaleToFit(650, 1000);
      header.setAlignment(Chunk.ALIGN_CENTER);
      Paragraph parrafo = new Paragraph();
      parrafo.setAlignment(Paragraph.ALIGN_CENTER);
      parrafo.add("Informacion del cliente. \n \n");
      parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

      // hacemos el documento
      documento.open();
      documento.add(header);
      documento.add(parrafo);
      PdfPTable tabla = new PdfPTable(3);
      tabla.addCell("ID");
      tabla.addCell("Nombre Cliente");
      tabla.addCell("Direccion");

      try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("select id, nombre, direccion from clientes where id = ?");
        pst.setString(1, idCli);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
          do {
            tabla.addCell(rs.getString(1));
            tabla.addCell(rs.getString(2));
            tabla.addCell(rs.getString(3));

          } while (rs.next());
          documento.add(tabla);
        }

        cn.close();

        // Creamos segunda tabla
        Paragraph parrafo2 = new Paragraph();
        parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
        parrafo2.add("Informacion de las facturas. \n \n");
        parrafo2.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

        // hacemos el documento
        documento.add(parrafo2);
        PdfPTable tabla2 = new PdfPTable(5);
        tabla2.addCell("Codigo Factura");
        tabla2.addCell("Codigo Cliente");
        tabla2.addCell("Fecha emision");
        tabla2.addCell("Cantidad a pagar");
        tabla2.addCell("Codigo Producto");

        try {
          Connection cn2 = Conexion.conectar();
          PreparedStatement pst2 = cn2
              .prepareStatement("select id, id_cliente, fecha, precio, id_producto from facturas where id_cliente = ?");
          pst2.setString(1, idCli);
          ResultSet rs2 = pst2.executeQuery();

          if (rs2.next()) {
            do {
              tabla2.addCell(rs2.getString(1));
              tabla2.addCell(rs2.getString(2));
              tabla2.addCell(rs2.getString(3));
              tabla2.addCell(rs2.getString(4));
              tabla2.addCell(rs2.getString(5));
            } while (rs2.next());
            documento.add(tabla2);
          }
          cn2.close();

        } catch (SQLException e) {
          System.err.println("Error al generar el informe de pedidos " + e);
        }

      } catch (SQLException e) {
        System.err.println("Error al generar el informe de clientes " + e);
      }

      documento.close();
      JOptionPane.showMessageDialog(null, "Informe creado");

    } catch (DocumentException | IOException e) {
      System.err.println("Error al crear el documento" + e);
      JOptionPane.showMessageDialog(null, "Error al generar el informe");
    }

  }

  // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrecliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idcliente = new javax.swing.JLabel();
        direccioncliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Symbol", 1, 24)); // NOI18N
        jLabel1.setText("FICHA DE CLIENTE");

        jLabel2.setText("Nombre Cliente: ");

        jLabel4.setText("Id Cliente");

        jLabel5.setText("Direccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(163, 163, 163))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(direccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(direccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MostrarInfoCliente().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel direccioncliente;
    private javax.swing.JLabel idcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombrecliente;
    // End of variables declaration//GEN-END:variables

}
