import java.util.Scanner;

public class sumarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements to be inserted in array: ");
        int num = sc.nextInt();
        int a[] = new int[num];

        System.out.println("Enter " + num + "Elements : ");

        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < num; j++) {
            sum = sum + a[j];
        }
        System.out.println("Sum is : " + sum);
    }
}