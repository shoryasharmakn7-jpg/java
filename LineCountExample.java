import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCountExample {
    public static void main(String[] args) {

        int lines = 0;

        try {
            File file = new File("write.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }

            sc.close();

            System.out.println("Lines: " + lines);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}