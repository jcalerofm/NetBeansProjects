/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package consultamedica;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author jorge
 */
public class registrarpaciente extends JFrame {

    public static String nombrePaciente; 
    public static String apellido1Paciente; 
    public static String apellido2Paciente; 
    public static String telefonoPaciente;
    public static String dniPaciente;
    public static String observaciones;
    public static String segSocial;
    public int contOpt = 0;
    public static String opcionales;
    public static String diabStr, alergStr, covidStr, hipertStr, deprStr, fumaStr;
    public boolean diabete, alergia, covid, hiperten, depre, fuma;
    public static String obligatoria;
    public static String especialidad;
    
    public registrarpaciente() {
        initComponents();
        setIconImage(getIconImage());
    }

    
    public void leerDatos(){
        nombrePaciente = txtNombre.getText();
        apellido1Paciente = txtApellido1.getText();
        apellido2Paciente = txtApellido2.getText();
        dniPaciente = txtDNI.getText();
        telefonoPaciente = txtTelefono.getText();
        observaciones = txtObservaciones.getText();
        segSocial = txtNumSegSocial.getText();
        opcionales = (String) cBoxEspecialidad.getSelectedItem();
        leerCheckbox();
        leerRadioButton();
        especialidad = cBoxEspecialidad.getSelectedItem().toString();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        chDiabetes = new javax.swing.JCheckBox();
        chAlergias = new javax.swing.JCheckBox();
        chFuma = new javax.swing.JCheckBox();
        chCovid = new javax.swing.JCheckBox();
        chDepre = new javax.swing.JCheckBox();
        chHipertension = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtDNI = new javax.swing.JTextField();
        txtNumSegSocial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        limpiarRegistro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rBtnRodrig = new javax.swing.JRadioButton();
        rBtnCalero = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rBtnNieto = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cBoxEspecialidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Num. Seg.Social");

        jLabel12.setText("Especialidad");

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel13.setText("Indicar patologías comunes (Máx. 3)");

        chDiabetes.setText("Diabetes");
        chDiabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chDiabetesActionPerformed(evt);
            }
        });

        chAlergias.setText("Alergias");
        chAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chAlergiasActionPerformed(evt);
            }
        });

        chFuma.setText("Fumador/a");
        chFuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chFumaActionPerformed(evt);
            }
        });

        chCovid.setText("Ha pasado el COVID19");
        chCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chCovidActionPerformed(evt);
            }
        });

        chDepre.setText("Depresion / Ansiedad");
        chDepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chDepreActionPerformed(evt);
            }
        });

        chHipertension.setText("Hipertension");
        chHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chHipertensionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(chDiabetes)
                    .addComponent(chAlergias)
                    .addComponent(chCovid)
                    .addComponent(chHipertension)
                    .addComponent(chDepre)
                    .addComponent(chFuma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chDiabetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chAlergias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chCovid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chHipertension)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chDepre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chFuma)
                .addGap(55, 55, 55))
        );

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel14.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel15.setText("REGISTRO DE PACIENTE");

        limpiarRegistro.setText("Limpiar Formulario");
        limpiarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRegistroActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        buttonGroup1.add(rBtnRodrig);
        rBtnRodrig.setText("Dra. Rodriguez");
        rBtnRodrig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnRodrigActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtnCalero);
        rBtnCalero.setText("Dr. Calero");
        rBtnCalero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnCaleroActionPerformed(evt);
            }
        });

        jLabel11.setText("Asigne un Dr/Dra. (obligatorio, al menos uno)");

        buttonGroup1.add(rBtnNieto);
        rBtnNieto.setText("Dr. Nieto");
        rBtnNieto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnNietoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rBtnCalero)
                    .addComponent(rBtnRodrig)
                    .addComponent(jLabel11)
                    .addComponent(rBtnNieto))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnRodrig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnCalero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnNieto)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setText("Apellido 1");

        jLabel3.setText("Apellido 2");

        jLabel4.setText("Telefono");

        jLabel5.setText("DNI");

        cBoxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Traumatologia", "Cardiologia", "Neumologia", "Pediatria" }));
        cBoxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(limpiarRegistro)
                                .addGap(26, 26, 26)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellido1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefono)
                                            .addComponent(txtApellido2))))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumSegSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cBoxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel15)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumSegSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cBoxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(limpiarRegistro))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     @Override
    public Image getIconImage(){
    Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imgs/harold.jpeg"));
    return icon;
    }
    
    private void chDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chDiabetesActionPerformed
        // TODO add your handling code here:
        if (chDiabetes.isSelected()==true) {
            if (contOpt<3) {
                chDiabetes.setSelected(true);
                contOpt++;
                diabete=true;
            } else {
                chDiabetes.setSelected(false);
                JOptionPane.showMessageDialog(null, "Maximo tres opciones");
            }
        }else{
            chDiabetes.setSelected(false);
            contOpt--;
            diabete=false;
        }
        System.out.println("Pulsados: " + contOpt);
    }//GEN-LAST:event_chDiabetesActionPerformed

    private void chAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chAlergiasActionPerformed
        // TODO add your handling code here:
        if (chAlergias.isSelected()==true) {
            if (contOpt<3) {
                chAlergias.setSelected(true);
                contOpt++;
                alergia=true;
            } else {
                chAlergias.setSelected(false);
                JOptionPane.showMessageDialog(null, "Maximo tres opciones");
            }
        }else{
            chAlergias.setSelected(false);
            contOpt--;
            alergia=false;
        }
        System.out.println("Pulsados: " + contOpt);
    }//GEN-LAST:event_chAlergiasActionPerformed

    private void chFumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chFumaActionPerformed
        // TODO add your handling code here:
        if (chFuma.isSelected()==true) {
            if (contOpt<3) {
                chFuma.setSelected(true);
                contOpt++;
                fuma=true;
            } else {
                chFuma.setSelected(false);
                JOptionPane.showMessageDialog(null, "Maximo tres opciones");
            }
        }else{
            chFuma.setSelected(false);
            contOpt--;
            fuma=false;
        }
        System.out.println("Pulsados: " + contOpt);
    }//GEN-LAST:event_chFumaActionPerformed

    private void chCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chCovidActionPerformed
        // TODO add your handling code here:
        if (chCovid.isSelected()==true) {
            if (contOpt<3) {
                chCovid.setSelected(true);
                contOpt++;
                covid=true;
            } else {
                chCovid.setSelected(false);
                JOptionPane.showMessageDialog(null, "Maximo tres opciones");
            }
        }else{
            chCovid.setSelected(false);
            contOpt--;
            covid=false;
        }
        System.out.println("Pulsados: " + contOpt);
    }//GEN-LAST:event_chCovidActionPerformed

    private void chDepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chDepreActionPerformed
        // TODO add your handling code here:
        if (chDepre.isSelected()==true) {
            if (contOpt<3) {
                chDepre.setSelected(true);
                contOpt++;
                depre=true;
            } else {
                chDepre.setSelected(false);
                JOptionPane.showMessageDialog(null, "Maximo tres opciones");
            }
        }else{
            chDepre.setSelected(false);
            contOpt--;
            depre=false;
        }
        System.out.println("Pulsados: " + contOpt);
    }//GEN-LAST:event_chDepreActionPerformed

    private void chHipertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chHipertensionActionPerformed
        // TODO add your handling code here:
        if (chHipertension.isSelected()==true) {
            if (contOpt<3) {
                chHipertension.setSelected(true);
                contOpt++;
                hiperten=true;
            } else {
                chHipertension.setSelected(false);
                JOptionPane.showMessageDialog(null, "Maximo tres opciones");
            }
        }else{
            chHipertension.setSelected(false);
            contOpt--;
            hiperten=false;
        }
        System.out.println("Pulsados: " + contOpt);
    }//GEN-LAST:event_chHipertensionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        leerDatos();
        mostrarinfopaciente mostrar = new mostrarinfopaciente();
        mostrar.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void limpiarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRegistroActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtTelefono.setText("");
        txtDNI.setText("");
        txtNumSegSocial.setText("");
        txtObservaciones.setText("");
        cBoxEspecialidad.setSelectedIndex(0);
        chDiabetes.setSelected(false);
        chAlergias.setSelected(false);
        chFuma.setSelected(false);
        chCovid.setSelected(false);
        chDepre.setSelected(false);
        chHipertension.setSelected(false);
        buttonGroup1.clearSelection();
        contOpt = 0;
        
    }//GEN-LAST:event_limpiarRegistroActionPerformed

    private void rBtnRodrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnRodrigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnRodrigActionPerformed

    private void rBtnCaleroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnCaleroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnCaleroActionPerformed

    private void cBoxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxEspecialidadActionPerformed

    private void rBtnNietoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnNietoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnNietoActionPerformed

      public void leerCheckbox() {
        if (contOpt >0){
            // diabStr, alergStr, covidStr, hipertStr, deprStr, fumaStr;
            if(diabete){
                diabStr = "Diabetes ";
            }else{
                diabStr= "";
            }
            if(alergia){
                alergStr = "Alergia ";
            }else{
                alergStr= "";
            }
            if(covid){
                covidStr = "Covid ";
            }else{
                covidStr= "";
            }
            if(hiperten){
                hipertStr = "Hipertension ";
            }else{
                hipertStr= "";
            }
            if(depre){
                deprStr = "Depresion ";
            }else{
                deprStr= "";
            }
            if(fuma){
                fumaStr = "Fumador/a ";
            }else{
                fumaStr= "";
            }
            opcionales = diabStr + alergStr + covidStr + hipertStr + deprStr + fumaStr ;
        }else{
            opcionales = "No se ha elegido ninguna patologia previa";
        }
    }
    
    public void leerRadioButton(){
        if (rBtnRodrig.isSelected()){
            obligatoria ="Dra. Rodriguez";
        }else if (rBtnCalero.isSelected()){
            obligatoria = "Dr. Calero";
        }else if (rBtnNieto.isSelected()){
            obligatoria = "Dr. Nieto" ;
        }else{
            obligatoria = "No se ha seleccionado ningun Dr/Dra";
        }
    }
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarpaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cBoxEspecialidad;
    private javax.swing.JCheckBox chAlergias;
    private javax.swing.JCheckBox chCovid;
    private javax.swing.JCheckBox chDepre;
    private javax.swing.JCheckBox chDiabetes;
    private javax.swing.JCheckBox chFuma;
    private javax.swing.JCheckBox chHipertension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiarRegistro;
    private javax.swing.JRadioButton rBtnCalero;
    private javax.swing.JRadioButton rBtnNieto;
    private javax.swing.JRadioButton rBtnRodrig;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumSegSocial;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
