import java.util.*;

public class SixInOne {
    public static void sumArray(int num[]) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("sum of array is: " + sum);
    }

    public static void max(int num[]) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("max of array is: " + max);
    }

    public static void reverseString(String str) {
        char a[] = str.toCharArray();
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed string is: " + String.valueOf(a));
    }

    public static void Palindrome(String str) {
        char a[] = str.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            if (a[start] != a[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome == true) {
            System.out.println("Is pal");
        } else {
            System.out.println("not a pal");
        }
    }

    public static void factorial(int b) {
        int fact = 1;
        for (int i = b; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial is: " + fact);
    }

    public static void Prime(int b) {
        boolean isPrime = true;
        if (b <= 1) {
            System.out.println("not a prime");
        }
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("is prime");
        } else {
            System.out.println("not a prime");
        }
    }

    public static void main(String args[]) {
        int b = 5;
        String str = "BiggBoss";
        int num[] = { 2, 4, 6 };
        sumArray(num);
        max(num);
        reverseString(str);
        Palindrome(str);
        factorial(b);
        Prime(b);
    }
}