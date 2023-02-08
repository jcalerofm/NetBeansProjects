

package dimeip;
import java.net.InetAddress;


public class DimeIP {

   
    public static void main(String[] args) throws Exception{
      InetAddress myIP=InetAddress.getLocalHost();
 
      System.out.println("Mi direccion IP es:");
      System.out.println(myIP.getHostAddress());
    }

}
