

package exameninterfjorgecalero;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class ReservaVacaciones extends JFrame {

    public static String nombre;
    public static String apellidos;
    public static String telefono;
    public static String direccion;
    public static String codpostal;
    public static String ciudad;
    public static String email;
    public static String obligatorio;
    public static String opcionales;
    public static String eligeciudad;
    public static String montanaSt, playaSt, ciudadSt;
    
    




    public ReservaVacaciones() {
        initComponents();
    }

    public void leerDatos() {
        nombre = txtNombre.getText();
        apellidos = txtApellidos.getText();
        telefono = txtTelefono.getText();
        direccion = txtDireccion.getText();
        codpostal = txtCP.getText();
        ciudad = txtCiudad.getText();
        email = txtEmail.getText();
        leerRadioButton();
        leerCheckbox();
        eligeciudad = cBoxCiudades.getSelectedItem().toString();
        
        
        

    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rbMontana = new javax.swing.JRadioButton();
        rbPlaya = new javax.swing.JRadioButton();
        rbCiudades = new javax.swing.JRadioButton();
        cbMontana = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        cbPlaya = new javax.swing.JCheckBox();
        cbCiudades = new javax.swing.JCheckBox();
        cBoxCiudades = new javax.swing.JComboBox<>();
        reservar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel1.setText("FORMULARIO DE RESERVA");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Cod.Postal:");

        jLabel7.setText("Ciudad:");

        jLabel8.setText("Email:");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel9.setText("¿Dónde preferiria unas vacaciones largas?");

        buttonGroup1.add(rbMontana);
        rbMontana.setText("Montaña");

        buttonGroup1.add(rbPlaya);
        rbPlaya.setText("Playa");

        buttonGroup1.add(rbCiudades);
        rbCiudades.setText("Conocer otras ciudades");

        cbMontana.setText("Montaña");

        jLabel10.setText("¿Dónde preferiria pasar un fin de semana o puente?");

        cbPlaya.setText("Playa");
        cbPlaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlayaActionPerformed(evt);
            }
        });

        cbCiudades.setText("Conocer otras ciudades");
        cbCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudadesActionPerformed(evt);
            }
        });

        cBoxCiudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paris", "Praga", "Londres", "Viena", "Berlin", "Roma", "Venecia" }));
        cBoxCiudades.setEnabled(false);

        reservar.setText("RESERVAR");
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbPlaya)
                                    .addComponent(jLabel9))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbCiudades)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbMontana)
                                            .addComponent(cbPlaya)
                                            .addComponent(jLabel10))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbMontana)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbCiudades)
                                        .addGap(75, 75, 75)
                                        .addComponent(reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMontana)
                    .addComponent(cbMontana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPlaya)
                    .addComponent(cbPlaya))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCiudades)
                    .addComponent(cbCiudades)
                    .addComponent(cBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(reservar)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void cbPlayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlayaActionPerformed

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        // TODO add your handling code here:
        leerDatos();
        DatosReserva inforeserva = new DatosReserva();
        inforeserva.setResizable(false);
        inforeserva.setLocationRelativeTo(null);
        inforeserva.setVisible(true);
    }//GEN-LAST:event_reservarActionPerformed

    private void cbCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudadesActionPerformed
        // TODO add your handling code here:
        if (cbCiudades.isSelected()){
            cBoxCiudades.setEnabled(true);
        }else{
            cBoxCiudades.setEnabled(false);
        }
    }//GEN-LAST:event_cbCiudadesActionPerformed

    public void leerCheckbox(){
        if (cbMontana.isSelected()){
            montanaSt = "Montaña ";
        }else{ montanaSt = "";}
        
        if (cbPlaya.isSelected()){
            playaSt = "Playa ";
        }else{ playaSt = "";}
        
        if (cbCiudades.isSelected()){
            ciudadSt = "y Ciudades";
        }else{ ciudadSt = "";}
        
        opcionales = montanaSt + playaSt + ciudadSt;
    }
    
    
    
    
    public void leerRadioButton(){
        if (rbMontana.isSelected()){
            obligatorio ="Montaña ";
        }else if (rbPlaya.isSelected()){
            obligatorio = "Playa ";
        }else if (rbCiudades.isSelected()){
            obligatorio = "Conocer otras ciudades" ;
        }else{
            obligatorio = "No se ha seleccionado ningun destino";
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaVacaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cBoxCiudades;
    private javax.swing.JCheckBox cbCiudades;
    private javax.swing.JCheckBox cbMontana;
    private javax.swing.JCheckBox cbPlaya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbCiudades;
    private javax.swing.JRadioButton rbMontana;
    private javax.swing.JRadioButton rbPlaya;
    private javax.swing.JButton reservar;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private JTextField setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
