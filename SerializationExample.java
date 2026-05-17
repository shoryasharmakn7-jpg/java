import java.io.*;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) {

        try {
            Student s = new Student(101, "Rahul");

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("student.txt"));

            out.writeObject(s);

            out.close();

            System.out.println("Object serialized");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}