package informepdf;

import java.io.*;
import java.sql.*;
import javax.swing.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Chunk;
import clases.*;
import com.itextpdf.text.BadElementException;

public class InformePDF {

  private String idCliente;

  public InformePDF(String idCliente) {
    this.idCliente = idCliente;
  }

  public void generarInforme() {

    Document documento = new Document();

    try {
      String ruta = System.getProperty("user.home");
      PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Informe.pdf"));

      //Cabecera
      com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/img/banne.png");
      header.scaleToFit(650, 1000);
      header.setAlignment(Chunk.ALIGN_CENTER);
      Paragraph parrafo = new Paragraph();
      parrafo.setAlignment(Paragraph.ALIGN_CENTER);
      parrafo.add("Informacion del cliente. \n \n");
      parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

      //Documento
      documento.open();
      documento.add(header);
      documento.add(parrafo);
      PdfPTable tabla = new PdfPTable(5);
      tabla.addCell("id");
      tabla.addCell("Nombre");
      tabla.addCell("Apellido");
      tabla.addCell("Email");
      tabla.addCell("Telefono");

      try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
          "SELECT id, nombre, primer_apellido, email, telefono FROM TiendaReparacion.clientes where id=?");
        pst.setString(1, idCliente);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
          do {
            tabla.addCell(rs.getString(1));
            tabla.addCell(rs.getString(2));
            tabla.addCell(rs.getString(3));
            tabla.addCell(rs.getString(4));
            tabla.addCell(rs.getString(5));
          } while (rs.next());
          documento.add(tabla);
        }

        cn.close();

        //Creamos segunda tabla

      } catch (SQLException e) {
        System.err.println("Error al generar el informe." + e);
      }

      documento.close();
      JOptionPane.showMessageDialog(null, "Informe creado correctamente.");

    } catch (DocumentException | IOException e) {
      System.err.println("Error al generar el informe." + e);
      JOptionPane.showMessageDialog(null, "Error al generar el informe.");
    }

  }
  public static void main(String[] args) {}
}
