
package cmdline4;
import java.io.File;

public class CmdLine4 {


    public static void main(String[] args) {
      File dir1 = new File("/Users/jorge/Desktop/d1");
      dir1.mkdir();
      File dir2 = new File("/Users/jorge/Desktop/d2");
      dir2.mkdir();
      File file1 = new File("/Users/jorge/Desktop/d1/f11.txt");
      File file2 = new File("/Users/jorge/Desktop/d2/f21.txt");
      try {
        file1.createNewFile();
        file2.createNewFile();
      } catch (Exception e) {
        System.out.println("Error: " + e);
      }
    }

}
