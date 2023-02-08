
package usoThreads;


import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoRebote();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}


// PASAR DE MONO A MULTI-TAREA

//1- Crear clase implementes runnable usando su metodo run()
class PelotaHilos implements Runnable{
    
    public PelotaHilos (Pelota unaPelota, Component unComponente){
        pelota = unaPelota;
        componente = unComponente;  
    }
    
    @Override
    public void run(){
      
        //2- Escribir cod.tarea del hilo dentro del metodo run()
        while(!Thread.currentThread().isInterrupted()) {   //Mientras el hilo no este siendo interrumpido ejecuta el TRY, en el catch lo detiene
        //for (int i=1; i<=3000; i++){
				
            pelota.mueve_pelota(componente.getBounds());

//             componente.paint(componente.getGraphics());
            componente.repaint();
             //Paso 1
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                Thread.currentThread().interrupt(); // PARAMOS EL HILO
            }
        }
        
    }
    
    
    
    private Pelota pelota;
    private Component componente;
}



//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota{
	
	// Mueve la pelota invirtiendo posici�n si choca con l�mites
	
	public void mueve_pelota(Rectangle2D limites){
		
		x+=dx;
		
		y+=dy;
		
		if(x<limites.getMinX()){
			
			x=limites.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			
			x=limites.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			
			y=limites.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			
			y=limites.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
	//Forma de la pelota en su posici�n inicial
        
        public Ellipse2D shape = null;
	
	public Ellipse2D getShape(){
		if (shape == null)
                {
                    shape = new Ellipse2D.Double(x, y, TAMX, TAMY);
                }
                shape.setFrame(x, y, TAMX, TAMY);
		return shape;		
	}	
	
	private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=1;
	
	private double dy=1;
        
        public double getX() { return x; }
        public double getY() { return y; }
	
	
}

// L�mina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{
	
	//A�adimos pelota a la l�mina
    
        private Image dvdImage;
        
        public void loadImage()
        {
            dvdImage = new ImageIcon("/Users/jorge/Desktop/dvd.png").getImage();
        }
	
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
        @Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota b: pelotas){
			
			 //g2.fill(b.getShape());
                        g2.drawImage(dvdImage, (int) b.getX(), (int) b.getY(), new ImageObserver() {
                            @Override
                            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                                // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                                return true;
                            }
                        });
		}
		
	}
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con l�mina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{
	
	public MarcoRebote(){
		
		setBounds(600,300,600,350);
		
		setTitle ("Rebotes");
		
		lamina=new LaminaPelota();
		lamina.loadImage();
		add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
                
                
                
                
             // CREAR NUEVOS BOTONES dale1, dale2, dale3, parar1, parar2, parar3, salir
             dale1 = new JButton("Dale1");
                dale1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        comienza_el_juego(evento);
                    }
                });
                
                //lo agregamos a la lamina
                laminaBotones.add(dale1);
                add(laminaBotones, BorderLayout.SOUTH);
                
             dale2 = new JButton("Dale2");
                dale2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        comienza_el_juego(evento);
                    }
                });
                
                //lo agregamos a la lamina
                laminaBotones.add(dale2);
                add(laminaBotones, BorderLayout.SOUTH);
                
             dale3 = new JButton("Dale3");
                dale3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        comienza_el_juego(evento);
                    }
                });
                
                //lo agregamos a la lamina
                laminaBotones.add(dale3);
                add(laminaBotones, BorderLayout.SOUTH);
             
             parar1 = new JButton("Parar1");
                parar1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        detener(evento);
                    }
                });
                
                //lo agregamos a la lamina
                laminaBotones.add(parar1);
                add(laminaBotones, BorderLayout.SOUTH);
                
             parar2 = new JButton("Parar2");
                parar2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        detener(evento);
                    }
                });
                
                //lo agregamos a la lamina
                laminaBotones.add(parar2);
                add(laminaBotones, BorderLayout.SOUTH);
                
             parar3 = new JButton("Parar3");
                parar3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        detener(evento);
                    }
                });
                
                //lo agregamos a la lamina
                laminaBotones.add(parar3);
                add(laminaBotones, BorderLayout.SOUTH);
                
             salir = new JButton("Salir");
                salir.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        System.exit(0);
                    }
                });
                
                //lo agregamos a la lamina
                laminaBotones.add(salir);
                add(laminaBotones, BorderLayout.SOUTH);
                
             
             
		
//		ponerBoton(laminaBotones, "Dale!", new ActionListener(){
//			
//			public void actionPerformed(ActionEvent evento){
//				
//				comienza_el_juego();
//			}
//			
//		});
//		
//                ponerBoton(laminaBotones, "Detener!", new ActionListener(){
//			
//			public void actionPerformed(ActionEvent evento){
//				
//				detener();
//			}
//			
//		});
//		
//		ponerBoton(laminaBotones, "Salir", new ActionListener(){
//			
//			public void actionPerformed(ActionEvent evento){
//				
//				System.exit(0);
//				
//			}
//			
//		});
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
	//Ponemos botones
	
//	public void ponerBoton(Container c, String titulo, ActionListener oyente){
//		
//		JButton boton=new JButton(titulo);
//		
//		c.add(boton);
//		
//		boton.addActionListener(oyente);
//		
//	}
	
	//A�ade pelota y la bota 1000 veces
	
	public void comienza_el_juego (ActionEvent e){
		
            Pelota pelota = new Pelota();
           //3- Instanciar la clase creada y almacenar la instancia en variable de tipo runnable

          Runnable r = new PelotaHilos(pelota, lamina);
          lamina.add(pelota);
          //4- Crear Instancia de la clase Thread pasando como parametro la variable creada en el paso 3
          if (e.getSource() == dale1){
            t1 = new Thread(r);
            t1.start();
          }else if (e.getSource() == dale2){
            t2 = new Thread(r);
            t2.start();
          }else{
            t3 = new Thread(r);
            t3.start();
          } 
			
		
		
	}
	
	public void detener(ActionEvent e) {
            if (e.getSource().equals(parar1)){
                t1.interrupt();
            } else if (e.getSource().equals(parar2)){
                t2.interrupt();
            } else {
                t3.interrupt();
            }
        }
	
	
        
        
        
        public Thread t1, t2, t3;
        public JButton dale1, dale2, dale3, parar1, parar2, parar3, salir;
        
        private LaminaPelota lamina;
        
}








