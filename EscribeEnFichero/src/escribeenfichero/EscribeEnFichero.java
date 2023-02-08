

package escribeenfichero;

import java.io.*;

public class EscribeEnFichero {

   
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("/Users/jorge/Desktop/d1/f12.txt", false);
        DataOutputStream out = new DataOutputStream(f);
        
        //Array de numeros enteros
        
        int[] m = {4,6,2,7,8,2,3};
        
        for (int i=0; i<m.length; i++) {
            out.writeInt(m[i]);
        }
        
        out.close();
    }

}
