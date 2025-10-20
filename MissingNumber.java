public class MissingNumber {
    public static int MissNum(int a[]) {
        int n = a.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < a.length; i++) {
            actualSum = actualSum + a[i];
        }
        int missingNum = expectedSum - actualSum;
        return missingNum;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 4, 5 };
        System.out.println(MissNum(a));
    }
}
