
package ventana;

import java.awt.*;
import javax.swing.*;


public class formas extends JFrame {


    public formas() {
        initComponents();
        this.setBounds(0, 0, 600, 400);
        this.setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        //DRAW pinta y FILL rellena


        g.setColor(Color.BLUE);
        g.drawLine(0, 70 ,100,70);
        g.drawRect(150, 70, 50, 70);
        g.drawRoundRect(250, 70, 50, 70, 6, 6);
        g.drawOval(350, 70, 50, 70);

        //Hacer un triangulo
        int vectorX [] = {500, 550, 450};
        int vectorY [] = {70, 120, 120};
        g.drawPolygon(vectorX, vectorY, 3);

        //Hacer un triangulo rectangulo
//        int X [] = {150, 300, 150};
//        int Y [] = {100, 200, 200};
//        g.drawPolygon(X, Y, 3);

        //RELLENAR CON COLORES

        g.setColor(Color.GREEN);
        g.fillRect(150, 270, 50, 70); //RECTANGULO
        g.setColor(Color.red);
        g.fillRoundRect(250, 270, 50, 70, 6, 6); //RECTANGULO CON PUNTAS REDONDAS
        g.setColor(Color.yellow);
        g.fillOval(350, 270, 50, 70); // OVALO
        g.setColor(Color.pink);
        int vectorX2 [] = {500, 550, 450}; //  (X, X, X ....) DEPENDE DEL NUMERO DE LADOS
        int vectorY2 [] = {270, 320, 320}; //  (Y, Y, Y ....) DEPENDE DEL NUMERO DE LADOS
        g.fillPolygon(vectorX2, vectorY2, 3); // EL 3 EN ESTE CASO ES PORQUE ES UN TRIANGULO, SI FUERA UN PENTAGONO PUES SERAN 5

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
