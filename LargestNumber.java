public class LargestNumber {
    public static void main(String args[]) {
        int a[] = { 2, 4, 1, 12, 7, 17, 3 };
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("Max is : " + max);
    }
}
