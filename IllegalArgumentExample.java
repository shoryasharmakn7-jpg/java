public class IllegalArgumentExample {

    static void checkNumber(int num) {

        if (num < 0) {
            throw new IllegalArgumentException(
                    "Negative numbers not allowed");
        }

        System.out.println("Valid Number");
    }

    public static void main(String[] args) {

        try {
            checkNumber(-5);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}