package cmdline;

import java.io.File;

public class CmdLine {

   
    public static void main(String[] args) {
     
      File dir = new File("/");
      String[] entries = dir.list();
      for (String entry : entries) {
        System.out.println(entry);
      }

    }

}
