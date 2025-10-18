public class palNumber {
    public static void main(String args[]) {
        int n = 121;
        int originalN = n;
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        if (originalN == revNum) {
            System.out.println("is pal");
        } else {
            System.out.println("not pal...");
        }
    }
}