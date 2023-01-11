package giai_thuat.ss2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 so");
        int number = Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
