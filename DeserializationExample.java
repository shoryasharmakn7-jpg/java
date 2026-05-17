import java.io.*;

class Student implements Serializable {

    int id;
    String name;
}

public class DeserializationExample {
    public static void main(String[] args) {

        try {
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("student.txt"));

            Student s = (Student) in.readObject();

            in.close();

            System.out.println(s.id + " " + s.name);

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}