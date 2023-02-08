
package encuestagrafica;

import java.util.ArrayList;

public class NewJFrame extends javax.swing.JFrame {


    public NewJFrame() {
        initComponents();
    }


    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Windows = new javax.swing.JRadioButton();
        Linux = new javax.swing.JRadioButton();
        MacOS = new javax.swing.JRadioButton();
        Programacion = new javax.swing.JCheckBox();
        DisenoGrafico = new javax.swing.JCheckBox();
        Administracion = new javax.swing.JCheckBox();
        Generar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Elige un Sistema Operativo");

        jLabel2.setText("Elige tu especialidad");

        buttonGroup1.add(Windows);
        Windows.setText("Windows");
        Windows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WindowsActionPerformed(evt);
            }
        });

        buttonGroup1.add(Linux);
        Linux.setText("Linux");
        Linux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinuxActionPerformed(evt);
            }
        });

        buttonGroup1.add(MacOS);
        MacOS.setText("MacOS");
        MacOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacOSActionPerformed(evt);
            }
        });

        Programacion.setText("Programacion");
        Programacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramacionActionPerformed(evt);
            }
        });

        DisenoGrafico.setText("Diseño Grafico");
        DisenoGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisenoGraficoActionPerformed(evt);
            }
        });

        Administracion.setText("Administracion");
        Administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministracionActionPerformed(evt);
            }
        });

        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Windows)
                    .addComponent(Linux)
                    .addComponent(MacOS))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Generar))
                            .addComponent(DisenoGrafico)
                            .addComponent(Programacion)
                            .addComponent(jLabel2)
                            .addComponent(Administracion))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Windows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Linux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MacOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Programacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisenoGrafico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Administracion)
                .addGap(39, 39, 39)
                .addComponent(Generar)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>

    private void LinuxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void WindowsActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void MacOSActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {
      ArrayList<String> especialty = new ArrayList<String>();
       if (Windows.isSelected()) {
            sistOpera = "Windows";
        } else if (Linux.isSelected()) {
            sistOpera = "Linux";
        } else if (MacOS.isSelected()) {
            sistOpera = "MacOS";
        }else{
            sistOpera = "No selecciono ningun sistema";
        }

        if (Programacion.isSelected()) {
          // push the value of Programacion into the array especialty
            especialty.add("Programacion");
        }
        if (DisenoGrafico.isSelected()) {
          // push the value of DisenoGrafico into the array especialty
            especialty.add("Diseno Grafico");
        }
        if (Administracion.isSelected()) {
          // push the value of Administracion into the array especialty
            especialty.add("Administracion");
        }
        // if none of the checkboxes are selected, push "No selecciono ninguna especialidad" into the array especialty
        if (especialty.isEmpty()) {
            especialty.add("No selecciono ninguna especialidad");
        }

        // concatenate the values of the array especialty into espec variable separated by commas depending on the lenght of the array
        for (int i = 0; i < especialty.size(); i++) {
            if (i == 0) {
                espec = especialty.get(i);
            } else {
                espec = espec + ", " + especialty.get(i);
            }
        }

        info in = new info();
        in.setVisible(true);
    }




    private void ProgramacionActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void DisenoGraficoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void AdministracionActionPerformed(java.awt.event.ActionEvent evt) {

    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Administracion;
    private javax.swing.JCheckBox DisenoGrafico;
    private javax.swing.JButton Generar;
    private javax.swing.JRadioButton Linux;
    private javax.swing.JRadioButton MacOS;
    private javax.swing.JCheckBox Programacion;
    private javax.swing.JRadioButton Windows;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    public static String sistOpera;
    public static String espec;
}
