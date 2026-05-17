import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) {

        try {
            FileInputStream in =
                    new FileInputStream("write.txt");

            FileOutputStream out =
                    new FileOutputStream("copy.txt");

            int i;

            while ((i = in.read()) != -1) {
                out.write(i);
            }

            in.close();
            out.close();

            System.out.println("File copied");

        } catch (IOException e) {
            System.out.println("Error copying file");
        }
    }
}