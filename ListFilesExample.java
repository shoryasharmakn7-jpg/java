import java.io.File;

public class ListFilesExample {
    public static void main(String[] args) {

        File dir = new File(".");

        String files[] = dir.list();

        for (String file : files) {
            System.out.println(file);
        }
    }
}