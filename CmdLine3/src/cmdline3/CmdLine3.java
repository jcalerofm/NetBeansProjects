
package cmdline3;
import java.io.File;

public class CmdLine3 {


    public static void main(String[] args) {
        File dir = new File(System.getProperty("user.dir"));
        listAll(dir, 0);
    }

    private static void listAll(File dir, int i) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(file.getName());
                listAll(file, i + 1);
            }
        }
    }

}
