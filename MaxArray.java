public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum = " + max);
    }
}
