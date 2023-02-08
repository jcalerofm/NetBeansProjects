package nube;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class VentanaArchivo extends javax.swing.JFrame{

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    public String nombreArch;
    public String textOk;

    public VentanaArchivo() {
        initComponents();
        Thread mihilo = new Thread((Runnable) this);
        mihilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTexto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubir.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSubir.setText("Subir");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        txtAreaTexto.setColumns(20);
        txtAreaTexto.setRows(5);
        jScrollPane1.setViewportView(txtAreaTexto);

        jLabel2.setFont(new java.awt.Font("New Peninim MT", 1, 24)); // NOI18N
        jLabel2.setText("Selecciona archivo para subir:");

        btnCargar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(575, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        //CARGAR
        if (seleccionado.showDialog(null, "Abrir Archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String contenido = AbrirArchText(archivo);
                    txtAreaTexto.setText(contenido);
                } else {
                    JOptionPane.showMessageDialog(null, "Error, seleccione un archivo de imagen(jpg,gif,png) o de texto(txt)");
                }
            }
        }
    }//GEN-LAST:event_btnSubirActionPerformed

    public String AbrirArchText(File archivo) {
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascii;
            while ((ascii = entrada.read()) != -1) {
                char caracter = (char) ascii;
                contenido += caracter;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenido;
    }

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        nombreArch = GuardarArchText(archivo);
        System.out.println("Guardar " + nombreArch);

        try {
            Socket miSocket = new Socket("192.168.1.56", 9999);
            PaqueteEnvio datos = new PaqueteEnvio();
            datos.setArchivo(archivo);
            datos.setMensaje(nombreArch);
            ObjectOutputStream paqueteReenvio = new ObjectOutputStream(miSocket.getOutputStream());
            paqueteReenvio.writeObject(datos);
            miSocket.close();
            txtAreaTexto.setText("");

        }catch (IOException e1){
            System.err.println("Error al recibir en el cliente. " + e1.getMessage());
        }

    }//GEN-LAST:event_btnCargarActionPerformed

    public String GuardarArchText(File archivo) {
        String respuesta = null;
        String nombreArch = null;

        if (seleccionado.showDialog(null, "Guardar archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();

            if (archivo.getName().endsWith("txt")) {
                nombreArch = archivo.getName();
                String contenidoAreaTxt = txtAreaTexto.getText();
            } else {
                JOptionPane.showMessageDialog(null, "Error, seleccione un archivo de imagen(jpg,gif,png) o de texto(txt)");
            }

        }
        return respuesta;
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
            java.util.logging.Logger.getLogger(VentanaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaTexto;
    // End of variables declaration//GEN-END:variables



}
