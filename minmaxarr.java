import java.util.*;

public class minmaxarr {

    public static ArrayList<Integer> findMinMax(int[] arr) {
        ArrayList<Integer> sortedArr = new ArrayList<>();

        for (int num : arr) {
            sortedArr.add(num);
        }

        Collections.sort(sortedArr);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(sortedArr.get(0));
        result.add(sortedArr.get(sortedArr.size() - 1));

        return result;
    }

    public static ArrayList<Integer> findMinMaxItr(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < mini)
                mini = num;
            if (num > maxi)
                maxi = num;
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(mini);
        result.add(maxi);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2 };

        // ArrayList<Integer> result = findMinMax(arr);
        // System.out.println(result.get(0) + " " + result.get(1));

        ArrayList<Integer> result = findMinMaxItr(arr);
        System.out.println(result.get(0) + " " + result.get(1));
    }
}