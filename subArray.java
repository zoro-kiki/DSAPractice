import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

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

    public static ArrayList<Integer> findKsubArray(int a[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        HashMap<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0, -1);
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            int rem = sum - k;
            if (myMap.containsKey(rem)) {
                int startingIndex = myMap.get(rem) + 1;
                list.set(0, startingIndex);
                list.add(i);
                break;
            }
            myMap.put(sum, i);
        }
        return list;
    }

    public static void main(String args[]) {
        int a[] = { 1, 4, 2, 0, 0, 5 };
        int k = 6;
        // System.out.println(checkSubArray(a, k));
        ArrayList<Integer> res = findKsubArray(a, k);
        if (res.get(0) == -1) {
            System.out.println("Not found");
            return;
        } else {
            System.out.println("Res -> [" + res.get(0) + ", " + res.get(1) + "]");
        }
    }
}