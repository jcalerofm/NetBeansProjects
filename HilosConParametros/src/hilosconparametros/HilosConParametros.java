
package hilosconparametros;


public class HilosConParametros {

    
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" Hilo-1 ");
        Proceso hilo2 = new Proceso(" Hilo-2 ");
        Proceso hilo3 = new Proceso(" Hilo-3 ");
        
        
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);
        hilo3.ValorDeLaCondicion(15);
        
        
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
    }
    
}
