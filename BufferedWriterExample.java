import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {

        try {
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("buffer.txt"));

            bw.write("Buffered Writer Example");

            bw.close();

            System.out.println("Written successfully");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}