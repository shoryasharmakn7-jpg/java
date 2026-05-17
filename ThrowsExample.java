import java.io.*;

public class ThrowsExample {

    static void checkFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}