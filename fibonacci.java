import java.util.Scanner;

public class fibonacci {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number...");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int nextNumber;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i < n; i++) {
            nextNumber = n1 + n2;
            System.out.println(nextNumber);
            n1 = n2;
            n2 = nextNumber;
        }
    }
}
