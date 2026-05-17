import java.io.File;

public class FileLengthExample {
    public static void main(String[] args) {

        File file = new File("write.txt");

        if (file.exists()) {
            System.out.println("File Size: "
                    + file.length() + " bytes");
        } else {
            System.out.println("File not found");
        }
    }
}