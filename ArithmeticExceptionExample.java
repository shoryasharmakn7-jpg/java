public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        try {
            int result = 100 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
        }
    }
}