public class fiboRec {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int result = fibo(n - 1) + fibo(n - 2);
        return result;
    }

    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i) + " ");
        }
    }
}
