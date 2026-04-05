import java.util.HashSet;

public class practice {
    public static boolean findKsubArr(int a[], int k) {
        HashSet<Integer> mySet = new HashSet<>();
        int sum = 0;
        mySet.add(0);
        for (int i = 0; i < a.length; i++) {
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
        int a[] = { 2, 8, 6, -6, 3, 8, 2 };
        int k = 5;
        System.out.println(findKsubArr(a, k));
    }
}