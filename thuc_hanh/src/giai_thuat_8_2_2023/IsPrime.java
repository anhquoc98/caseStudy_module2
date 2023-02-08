package giai_thuat_8_2_2023;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Prime");
        int number = Integer.parseInt(scanner.nextLine());
        int n = 2;
        int count1 = 0;
        boolean flag = false;
        while (n < number) {
            flag =false;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                flag =true;
                System.out.println(n);
            }
            n++;
        }
        if (flag==true){
            System.out.println(n);
        }
    }
}
