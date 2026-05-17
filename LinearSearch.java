public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 8;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
