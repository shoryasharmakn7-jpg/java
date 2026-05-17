import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("append.txt", true);

            writer.write("Appending new data\n");

            writer.close();

            System.out.println("Data appended");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}