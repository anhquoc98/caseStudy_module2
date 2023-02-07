import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arg1 = {1, 2, 3, 4};
        int[] a = new int[(arg1.length / 2)+(arg1.length%2)];
        int[] b = new int[arg1.length / 2];
        int count = 0;
        for (int i = 0; i < arg1.length; i++) {
            if (a[i] == 0) {
                a[i] = arg1[i];
                continue;
            }
            b[i] = arg1[i];
        }
        System.out.println(Arrays.toString(a));
    }
}