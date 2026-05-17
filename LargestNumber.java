public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a >= b && a >= c) {
            System.out.println(a + " is Largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is Largest");
        } else {
            System.out.println(c + " is Largest");
        }
    }
}
