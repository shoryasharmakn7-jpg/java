public class ClassNotFoundExample {

    public static void main(String[] args) {

        try {
            Class.forName("Demo");

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}