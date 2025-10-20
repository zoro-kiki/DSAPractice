import java.util.HashSet;

public class containsDup {
    public static boolean dup(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return true;
            } else {
                set.add(a[i]);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4 };
        System.out.println(dup(a));
    }
}
