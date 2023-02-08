

package proyectoventanasmenus;


public class DatosReserva extends javax.swing.JFrame {

    String FechaHo, NumCom, Intol, PrefM;

    public DatosReserva() {
        initComponents();
        FechaHo = MenuVentanas.vFechHora;
        NumCom = MenuVentanas.vNumCom;
        Intol = MenuVentanas.vIntol;
        PrefM = MenuVentanas.vPref;

        txtComensales.setText(NumCom);
        txtIntolerancias.setText(Intol);
        txtPrefMesa.setText(PrefM);
        txtFechaHora.setText(FechaHo);
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaHora = new javax.swing.JTextField();
        txtComensales = new javax.swing.JTextField();
        txtPrefMesa = new javax.swing.JTextField();
        txtIntolerancias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos de Reserva");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATOS DE SU RESERVA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha y hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nº Comensales:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pref. Mesa:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Int.Alimentaria:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        txtFechaHora.setEditable(false);
        getContentPane().add(txtFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 181, -1));

        txtComensales.setEditable(false);
        getContentPane().add(txtComensales, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 132, -1));

        txtPrefMesa.setEditable(false);
        getContentPane().add(txtPrefMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, -1));

        txtIntolerancias.setEditable(false);
        getContentPane().add(txtIntolerancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 248, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoventanasmenus/fondo.jpg"))); // NOI18N
        jLabel1.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, 0, 1020, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtComensales;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtIntolerancias;
    private javax.swing.JTextField txtPrefMesa;
    // End of variables declaration//GEN-END:variables

}
