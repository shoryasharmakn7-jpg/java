public class FinallyExample {
    public static void main(String[] args) {
        try {
            int num = 10 / 2;
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
