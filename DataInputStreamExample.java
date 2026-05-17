import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) {

        try {
            DataOutputStream dos =
                    new DataOutputStream(
                            new FileOutputStream("data.txt"));

            dos.writeInt(100);

            dos.close();

            DataInputStream dis =
                    new DataInputStream(
                            new FileInputStream("data.txt"));

            System.out.println(dis.readInt());

            dis.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}