

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


    public static void main(String[] args) throws FileNotFoundException, BadElementException, IOException {

        Document documento = new Document();

        try{
              //Creamos ruya y archivo PDF
              String ruta = System.getProperty("user.home");
              PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Informe.pdf"));

              //Creo la cabecera y estructura de los parrafos
              //Como en este caso la clase Image esta utilizada desde otro impor no se puede utilizar directamente
              com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/imagenes/jardin.jpeg");
              header.scaleToFit(650, 1000);
              header.setAlignment(Chunk.ALIGN_CENTER);
              Paragraph parrafo = new Paragraph();
              parrafo.setAlignment(Paragraph.ALIGN_CENTER);
              parrafo.add("Informacion del cliente. \n \n");
              parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

              //hacemos el documento
              documento.open();
              documento.add(header);
              documento.add(parrafo);
              PdfPTable tabla = new PdfPTable(5);
              tabla.addCell("ID");
              tabla.addCell("Cliente");
              tabla.addCell("Contacto");
              tabla.addCell("Telefono");
              tabla.addCell("Ciudad");

              try{
                  Connection cn = Conexion.conectar();
                  PreparedStatement pst = cn.prepareStatement("select CodigoCliente, NombreCliente, NombreContacto, Telefono, Ciudad from Clientes where CodigoCliente = ?");
                  pst.setString(1, "4");
                  ResultSet rs = pst.executeQuery();

                  if(rs.next()){
                      do{
                          tabla.addCell(rs.getString(1));
                          tabla.addCell(rs.getString(2));
                          tabla.addCell(rs.getString(3));
                          tabla.addCell(rs.getString(4));
                          tabla.addCell(rs.getString(5));
                      }while(rs.next());
                      documento.add(tabla);
                  }

                  cn.close();

                  //Creamos segunda tabla
                  Paragraph parrafo2 = new Paragraph();
                  parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                  parrafo2.add("Informacion de los pedidos. \n \n");
                  parrafo2.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

                  //hacemos el documento
                  documento.add(parrafo2);
                  PdfPTable tabla2 = new PdfPTable(4);
                  tabla2.addCell("Codigo Pedido");
                  tabla2.addCell("Codigo Producto");
                  tabla2.addCell("Cantidad");
                  tabla2.addCell("Precio por unidad");

                  try{
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement("select CodigoPedido, CodigoProducto, Cantidad, PrecioUnidad from DetallePedidos where CodigoPedido = ?");
                    pst2.setString(1, "4");
                    ResultSet rs2 = pst2.executeQuery();

                    if(rs2.next()){
                        do{
                            tabla2.addCell(rs2.getString(1));
                            tabla2.addCell(rs2.getString(2));
                            tabla2.addCell(rs2.getString(3));
                            tabla2.addCell(rs2.getString(4));
                        }while(rs2.next());
                        documento.add(tabla2);
                    }
                    cn2.close();

                  } catch(SQLException e){
                      System.err.println("Error al generar el informe de pedidos " + e);
                  }

              } catch(SQLException e){
                  System.err.println("Error al generar el informe de clientes " + e);
              }

              documento.close();
              JOptionPane.showMessageDialog(null, "Informe creado");

        }catch(DocumentException | IOException e){
            System.err.println("Error al crear el documento" + e);
            JOptionPane.showMessageDialog(null, "Error al generar el informe");
        }



    }

}
