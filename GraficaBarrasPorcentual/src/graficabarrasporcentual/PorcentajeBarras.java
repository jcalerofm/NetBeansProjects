

package graficabarrasporcentual;

import java.awt.*;
import javax.swing.*;

public class PorcentajeBarras extends JFrame {


    public PorcentajeBarras() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    boolean bandera = false;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRojo = new javax.swing.JTextField();
        txtVerde = new javax.swing.JTextField();
        txtAzul = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ROJO");

        jLabel2.setText("VERDE");

        jLabel3.setText("AZUL");

        txtRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRojoActionPerformed(evt);
            }
        });

        txtVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerdeActionPerformed(evt);
            }
        });

        txtAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAzulActionPerformed(evt);
            }
        });

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(txtVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(txtRojo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerdeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bandera = true;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRojoActionPerformed

    private void txtAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAzulActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PorcentajeBarras().setVisible(true);
            }
        });
    }

    public void paint (Graphics g) {

        super.paint(g);

        if (bandera == true) {
            String stRojo = txtRojo.getText();
            String stVerde = txtVerde.getText();
            String stAzul = txtAzul.getText();

            int intRojo = Integer.parseInt(stRojo);
            int intVerde = Integer.parseInt(stVerde);
            int intAzul = Integer.parseInt(stAzul);

            int total = intRojo + intVerde + intAzul;

            int largoRojo = intRojo * 600 / total;
            int largoVerde = intVerde * 600 / total;
            int largoAzul = intAzul * 600 / total;

            int porcRojo = intRojo * 100 / total;
            int porcVerde = intVerde * 100 / total;
            int porcAzul = intAzul * 100 / total;


            g.setColor(new Color(255, 0, 0));
            g.fillRect(50, 120, largoRojo, 50); //X, Y, Largo, Alto
            if(porcRojo !=0){
                g.setColor(new Color(255,255,255)); // Rojo, Verde, Azul
                g.drawString(porcRojo + "%", 55, 140); //STRING, X, Y
            }


            g.setColor(new Color(0, 130, 0));
            g.fillRect(50 + largoRojo, 120, largoVerde, 50);
            if(porcVerde !=0){
                g.setColor(new Color(255,255,255));
                g.drawString(porcVerde + "%", 55+largoRojo, 140);
            }

            g.setColor(new Color(0, 0, 255));
            g.fillRect(50 + largoRojo + largoVerde, 120, largoAzul, 50);
            if(porcAzul !=0){
                g.setColor(new Color(255,255,255));
                g.drawString(porcAzul + "%", 55+largoRojo + largoVerde, 140);
            }





        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAzul;
    private javax.swing.JTextField txtRojo;
    private javax.swing.JTextField txtVerde;
    // End of variables declaration//GEN-END:variables

}
