
package proyectoventanasmenus;

import com.github.lgooddatepicker.components.DateTimePicker;
import java.time.format.DateTimeFormatter;

public class MenuVentanas<DateTimePicker> extends javax.swing.JFrame {

    public static String vIntol;
    public static String vOtros;
    public static String vNumCom;
    public static String vPref;
    public static String vFechHora;

  public MenuVentanas() {
    initComponents();
  }

  public void leerDatos() {
      fechaHora();
      leerCheckbox();
      leerRadioButton();
      vNumCom = numComensales.getValue().toString();

  }

  public void leerCheckbox() {
    if (cbCeliaco.isSelected()) {
      vIntol = "Celiaco";
    }else{vIntol = "";}
    if (cbLactosa.isSelected()) {
      vIntol = vIntol + " Lactosa";
    }else{vIntol = vIntol + "";}
    if (cbOtros.isSelected()) {
      vIntol = vIntol + " Otros:" + txtOtraIntolerancia.getText();
    }else{vIntol = "";}

  }

  public void leerRadioButton() {
    if (rbInterior.isSelected()) {
      vPref = "Interior";
    } else if (rbTerraza.isSelected()) {
      vPref = "Terraza";
    } else {
      vPref = "No ha seleccionado ninguna opción";
    }
  }

  // crear metodo para fecha y hora
  public String fechaHora() {
    String fechahora, fecha, hora;
    fechahora = fechaHoraReserva.toString();

    // cambia el formato fechahora de yyyy-mm-ddThh:mm a dd/mm/yyyy hh:mm
    fecha = fechahora.substring(8, 10) + "/" + fechahora.substring(5, 7) + "/" + fechahora.substring(0, 4);
    hora = fechahora.substring(11, 16);
    System.out.println(fecha + " " + hora);
    return vFechHora = fecha + " " + hora;

  }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechaHoraReserva = new com.github.lgooddatepicker.components.DateTimePicker();
        numComensales = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbCeliaco = new javax.swing.JCheckBox();
        cbLactosa = new javax.swing.JCheckBox();
        cbOtros = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOtraIntolerancia = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        rbInterior = new javax.swing.JRadioButton();
        rbTerraza = new javax.swing.JRadioButton();
        reservaMesa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 150));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESERVA RESTAURANTE ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha y hora de Reserva");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, -1));

        fechaHoraReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fechaHoraReserva.setForeground(new java.awt.Color(102, 102, 102));
        fechaHoraReserva.setPreferredSize(new java.awt.Dimension(259, 26));
        fechaHoraReserva.setToolTipText("");
        getContentPane().add(fechaHoraReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 400, 40));

        numComensales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numComensalesStateChanged(evt);
            }
        });
        getContentPane().add(numComensales, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 100, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de comensales");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Alguna intolerancia alimentaria?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        cbCeliaco.setForeground(new java.awt.Color(255, 255, 255));
        cbCeliaco.setText("Celiaco/a");
        getContentPane().add(cbCeliaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        cbLactosa.setForeground(new java.awt.Color(255, 255, 255));
        cbLactosa.setText("Lactosa");
        getContentPane().add(cbLactosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        cbOtros.setText("Otros (especificar...)");
        cbOtros.setForeground(new java.awt.Color(255, 255, 255));
        cbOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtrosActionPerformed(evt);
            }
        });
        getContentPane().add(cbOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        txtOtraIntolerancia.setColumns(20);
        txtOtraIntolerancia.setRows(5);
        txtOtraIntolerancia.setText("Especificar intolerancia aqui...");
        txtOtraIntolerancia.setEnabled(false);
        txtOtraIntolerancia.setToolTipText("");
        jScrollPane1.setViewportView(txtOtraIntolerancia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Preferencia de mesa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, -1, -1));

        buttonGroup2.add(rbInterior);
        rbInterior.setText("Interior");
        rbInterior.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        rbInterior.setForeground(new java.awt.Color(255, 255, 255));
        rbInterior.setIconTextGap(-70);
        rbInterior.setToolTipText("");
        getContentPane().add(rbInterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, -1, -1));

        buttonGroup2.add(rbTerraza);
        rbTerraza.setText("Terraza");
        rbTerraza.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        rbTerraza.setForeground(new java.awt.Color(255, 255, 255));
        rbTerraza.setIconTextGap(-70);
        getContentPane().add(rbTerraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, -1, -1));

        reservaMesa.setBackground(new java.awt.Color(255, 255, 255));
        reservaMesa.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        reservaMesa.setForeground(new java.awt.Color(78, 80, 82));
        reservaMesa.setText("RESERVAR");
        reservaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaMesaActionPerformed(evt);
            }
        });
        getContentPane().add(reservaMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 240, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoventanasmenus/fondo.jpg"))); // NOI18N
        jLabel3.setText("FechaReserva");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 1230, 690));

        jMenu3.setText("Archivo");

        jMenuItem2.setText("Abrir Carta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Guardar Reserva");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Editar");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Acerca de...");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Sobre Nosotros");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtrosActionPerformed
      if (cbOtros.isSelected()) {
        txtOtraIntolerancia.setEnabled(true);
      } else {
        txtOtraIntolerancia.setEnabled(false);
      }

    }//GEN-LAST:event_cbOtrosActionPerformed

    private void reservaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaMesaActionPerformed
       leerDatos();
       DatosReserva inforeserva = new DatosReserva();
       inforeserva.setResizable(false);
       inforeserva.setLocationRelativeTo(null);
       inforeserva.setVisible(true);
    }//GEN-LAST:event_reservaMesaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        leerDatos();
       DatosReserva inforeserva = new DatosReserva();
       inforeserva.setResizable(false);
       inforeserva.setLocationRelativeTo(null);
       inforeserva.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

  private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenu5ActionPerformed

  }// GEN-LAST:event_jMenu5ActionPerformed

  private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem5ActionPerformed
    AcercaDe menu = new AcercaDe();
    menu.setResizable(false);
    menu.setLocationRelativeTo(null);
    menu.setVisible(true);
  }// GEN-LAST:event_jMenuItem5ActionPerformed

  private void numComensalesStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_numComensalesStateChanged
    // TODO add your handling code here:
  }// GEN-LAST:event_numComensalesStateChanged


  private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
    Menu menu = new Menu();
    menu.setResizable(false);
    menu.setLocationRelativeTo(null);
    menu.setVisible(true);

  }

  private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
    System.exit(0);
  }

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MenuVentanas().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbCeliaco;
    private javax.swing.JCheckBox cbLactosa;
    private javax.swing.JCheckBox cbOtros;
    private com.github.lgooddatepicker.components.DateTimePicker fechaHoraReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner numComensales;
    private javax.swing.JRadioButton rbInterior;
    private javax.swing.JRadioButton rbTerraza;
    private javax.swing.JButton reservaMesa;
    private javax.swing.JTextArea txtOtraIntolerancia;
    // End of variables declaration//GEN-END:variables


}
