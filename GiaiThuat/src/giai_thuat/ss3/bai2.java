package giai_thuat.ss3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input length:");
        int length =Integer.parseInt(scanner.nextLine());
        int []array =new int[length];
        int sum =0;
        int count =0;
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Nhập phần tử mảng");
            int value =Integer.parseInt(scanner.nextLine());
            array[i]=value;
            if (i%2 !=0){
                count++;
                sum +=value;
            }

        }
        System.out.println("tổng các so lẻ trong mảng"+sum/count);
    }
}
