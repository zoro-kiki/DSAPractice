import java.util.HashSet;

public class subArray {
    public static boolean checkSubArray(int a[], int k) {
        HashSet<Integer> mySet = new HashSet<>();
        int sum = 0;
        int n = a.length;
        mySet.add(0);
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            int rem = sum - k;
            if (mySet.contains(rem)) {
                return true;
            } else {
                mySet.add(sum);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int a[] = { 1, 4, 2, 0, 0, 5 };
        int k = 6;
        System.out.println(checkSubArray(a, k));
    }
}