public class practice {
    public static void main(String args[]) {
        String str = "Zaara";
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
        System.out.println(String.valueOf(a));

    }
}
