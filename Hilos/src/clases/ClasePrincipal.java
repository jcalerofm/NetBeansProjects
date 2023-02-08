
package clases;


public class ClasePrincipal {

   
    public static void main(String[] args) {
        
        //ejemplo de 2 procesos SIN HILOS
        
//        for (int i=0; i<=5; i++){
//            System.out.println("Proceso 1");
//        }
//        
//        System.out.println(" ");
//          
//        for (int i=0; i<=5; i++){
//            System.out.println("Proceso 2");
//        }
          
        
        
        //ejemplo de 2 procesos CON HILOS
            
        Proceso1 hilo1 = new Proceso1();// LO PODEMOS LLAMAR ASI PORQUE VIENE HEREDADA DE THREAD
        Thread hilo2 = new Thread(new Proceso2()); //LO LLAMAMOS ASI PORQUE USAMOS EL IMPLEMENT RUNNABLE
        
        hilo1.start();
        hilo2.start();
        
        
    }
      
}
