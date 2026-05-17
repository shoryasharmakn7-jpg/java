import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExample {

    public static void main(String[] args) {

        try {
            File file = new File("test.txt");

            Scanner sc = new Scanner(file);

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}