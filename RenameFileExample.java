import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {

        File oldFile = new File("copy.txt");

        File newFile = new File("newcopy.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed");
        } else {
            System.out.println("Rename failed");
        }
    }
}