import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        String str = "madam";
        boolean isPalindrome = true;
        char a[] = str.toCharArray();
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
            System.out.println("is a pal");
        } else {
            System.out.println("not a pal");
        }
    }
}
