import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {

        try {
            RandomAccessFile file =
                    new RandomAccessFile("random.txt", "rw");

            file.writeUTF("Java");

            file.seek(0);

            System.out.println(file.readUTF());

            file.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}