import java.io.File;

public class FileInfoExample {
    public static void main(String[] args) {

        File file = new File("write.txt");

        if (file.exists()) {

            System.out.println("File Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());

        } else {
            System.out.println("File does not exist");
        }
    }
}