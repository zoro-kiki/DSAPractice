import java.util.HashMap;

public class twoSum {
    public static int[] findTwoSum(int a[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int currentNum = a[i];
            int requiredNum = target - currentNum;
            if (map.containsKey(requiredNum)) {
                return new int[] { i, map.get(requiredNum) };
            } else {
                map.put(currentNum, i);
            }
        }
        return null;
    }

    public static void main(String args[]) {
        int a[] = { 2, 7, 11, 15 };
        int target = 9;
        int result[] = findTwoSum(a, target);
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Pair not found");
        }
    }
}
