class Student {
    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Student Name: " + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        new Student();
        new Student("Rahul");
    }
}
