
package cmdline5;
import java.io.*;

public class CmdLine5 {


    public static void main(String[] args) {
       // cambiar el nombre de un archivo
        File file1 = new File("/Users/jorge/Desktop/d1/f11.txt");
        File file2 = new File("/Users/jorge/Desktop/d1/f12.txt");
        file1.renameTo(file2);

      // mover el fichero f21.txt al directorio d1
        File file3 = new File("/Users/jorge/Desktop/d2/f21.txt");
        File file4 = new File("/Users/jorge/Desktop/d1/f21.txt");
        file3.renameTo(file4);

      // eliminar directorio d2
        File dir2 = new File("/Users/jorge/Desktop/d2");
        dir2.delete();

    }

}
