import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileR {



    public static void main(String[] args) throws IOException{
         File a=new File(".\\a\\b\\..\\b\\c\\.\\file.txt");
         File b=new File( "a\\b\\c\\file.txt");
         File c=new File("a\\b\\..\\file.txt");
         File d=new File("a\\..\\b\\c\\file.txt");
         File e=new File("a\\.\\b\\..\\c\\.\\file.txt");
         String a1=a.getName();
        String a2=b.getCanonicalPath();
        String a3=c.getCanonicalPath();
        String a4=d.getCanonicalPath();
        String a5=e.getCanonicalPath();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

    }

}
