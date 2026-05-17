class StudentData {
    String name = "Rahul";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        StudentData s = new StudentData();
        s.display();
    }
}
