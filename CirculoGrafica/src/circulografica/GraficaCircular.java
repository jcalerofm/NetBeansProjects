

package circulografica;

import java.awt.*;
import javax.swing.*;

public class GraficaCircular extends JFrame {

   
    public GraficaCircular() {
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

        txtVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerdeActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bandera = true;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerdeActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaCircular().setVisible(true);
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
            
            int totalVotos = intRojo + intVerde + intAzul;
            
            int grRojo = intRojo * 360 / totalVotos;
            int grVerde = intVerde * 360 / totalVotos;
            int grAzul = intAzul * 360 / totalVotos;
            
            g.setColor(new Color(255, 0, 0));
            g.fillArc(25, 80, 200, 200, 0, grRojo);  // fillArc(X, Y, grado_inicio, grado_final)
            g.fillRect(250, 120, 20, 20);
            g.drawString("Color Rojo", 275, 135);
            
            g.setColor(new Color(0, 130, 0));
            g.fillArc(25, 80, 200, 200, grRojo, grVerde);
            g.fillRect(250, 150, 20, 20);
            g.drawString("Color Verde", 275, 165);
            
            g.setColor(new Color(0, 0, 255));
            g.fillArc(25, 80, 200, 200, grVerde + grRojo, grAzul);
            g.fillRect(250, 180, 20, 20);
            g.drawString("Color Azul", 275, 195);
            
            
            
            
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
