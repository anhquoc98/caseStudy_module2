package Mang_java;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocCacPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng");
        int length =Integer.parseInt(scanner.nextLine());
        int []array =new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập các phần từ của mảng");
            int value =Integer.parseInt(scanner.nextLine());
            array[i]=value;
        }
        System.out.println(Arrays.toString(array));
    }
}
