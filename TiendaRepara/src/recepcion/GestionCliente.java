
package recepcion;
import informepdf.InformePDF;
import javax.swing.*;

import clases.Conexion;
import informepdf.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionCliente extends JFrame {
    public static String nombre;
    public static String primer_apellido;
    public static String segundo_apellido;
    public static String dni;
    public static int telefono;
    public static String email;
    public static String direccion;
    public static Date fecha_registro;

    public GestionCliente() {
        initComponents();
    }

    public void leerDatos() {
      nombre = tfNombre.getText();
      primer_apellido = tfApellido1.getText();
      segundo_apellido = tfApellido2.getText();
      dni = tfDni.getText();
      direccion = tfDireccion.getText();

      String telefonoInput = tfTelefono.getText();
      if (!telefonoInput.isEmpty()) {
        try {
          telefono = Integer.parseInt(telefonoInput);
        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de teléfono válido.");
          return;
        }
      } else {
        telefono = 0;
      }

      email = tfEmail.getText();
      fecha_registro = Date.valueOf(java.time.LocalDate.now());
      System.out.println(fecha_registro);

    }

    public String obtenerIdClientePorDni() {
      String dniCliente = tfDni.getText();
      String idCliente = null;

      if (dniCliente.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un DNI válido.");
        return null;
      }

      try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
            "SELECT id FROM TiendaReparacion.clientes WHERE dni=?");
        pst.setString(1, dniCliente);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
          idCliente = rs.getString(1);
        } else {
          JOptionPane.showMessageDialog(null, "No se encontró un cliente con el DNI proporcionado.");
        }

        cn.close();
      } catch (SQLException e) {
        System.err.println("Error al buscar el ID del cliente por DNI: " + e);
        JOptionPane.showMessageDialog(null, "Error al buscar el ID del cliente por DNI.");
      }

      return idCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellido1 = new javax.swing.JTextField();
        tfApellido2 = new javax.swing.JTextField();
        tfDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("1º Apellido");

        jLabel3.setText("2º Apellido");

        jLabel4.setText("DNI");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Email");

        jLabel7.setText("Direccion");

        jLabel8.setText("Gestion de Clientes");

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Generar Informe PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 51, 0));
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(78, 169, 107));
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("CREAR EXPEDIENTE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(34, 34, 34)
                                        .addComponent(jButton2)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton4)
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel2)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfApellido1)
                                                    .addComponent(tfNombre)
                                                    .addComponent(tfApellido2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(61, 61, 61))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                            .addComponent(tfEmail)
                                            .addComponent(tfTelefono))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tfApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(tfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
      String idCliente = obtenerIdClientePorDni();

      if (idCliente != null) {
        InformePDF pdf = new InformePDF(idCliente);
        pdf.generarInforme();
      }


    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        leerDatos();

      if (telefono != 0) {
        Conexion.registrarCliente(nombre, primer_apellido, segundo_apellido, dni, direccion, telefono, email,
            fecha_registro);
        // Limpiar el formulario después del registro
        tfNombre.setText("");
        tfApellido1.setText("");
        tfApellido2.setText("");
        tfDni.setText("");
        tfDireccion.setText("");
        tfTelefono.setText("");
        tfEmail.setText("");
        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
      } else {
        JOptionPane.showMessageDialog(null,
            "No se pudo registrar el cliente. Verifique el número de teléfono ingresado.");
      }

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
      leerDatos();

      if (telefono != 0) {
        Conexion.modifCliente(nombre, primer_apellido, segundo_apellido, dni, direccion, telefono, email, fecha_registro);
        // Limpiar el formulario después de la modificación
        tfNombre.setText("");
        tfApellido1.setText("");
        tfApellido2.setText("");
        tfDni.setText("");
        tfDireccion.setText("");
        tfTelefono.setText("");
        tfEmail.setText("");
        JOptionPane.showMessageDialog(null, "Cliente modificado con éxito");
      } else {
        JOptionPane.showMessageDialog(null,
            "No se pudo modificar el cliente. Verifique el número de teléfono ingresado.");
      }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
      leerDatos();

      if (!dni.isEmpty()) {
        Conexion.eliminarCliente(dni);
        // Limpiar el formulario después de la eliminación
        tfNombre.setText("");
        tfApellido1.setText("");
        tfApellido2.setText("");
        tfDni.setText("");
        tfDireccion.setText("");
        tfTelefono.setText("");
        tfEmail.setText("");
        JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
      } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un DNI para eliminar");
      }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
      leerDatos();
      String idCliente = obtenerIdClientePorDni();
      GestionExp ge = new GestionExp(idCliente, nombre, primer_apellido, segundo_apellido, dni, direccion, telefono,
          email);
      ge.setVisible(true);
      ge.setLocationRelativeTo(null);
      ge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
      leerDatos();

      if (!dni.isEmpty()) {
        Conexion.buscarCliente(dni, tfNombre, tfApellido1, tfApellido2, tfDireccion, tfTelefono, tfEmail);
      } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un DNI para buscar");
      }
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfApellido1;
    private javax.swing.JTextField tfApellido2;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEmail;
    javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
