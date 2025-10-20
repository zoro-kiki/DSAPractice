import java.util.Arrays;

public class anagram {

    public static boolean anag(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String str1 = "listen";
        String str2 = "silent";
        anag(str1, str2);
    }
}
