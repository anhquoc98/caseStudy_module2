package Bai1;

import java.util.Scanner;

public class UocCuaCacSoChan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int number;
        do{
            System.out.println("Nhập n<5000");
            number =Integer.parseInt(scanner.nextLine());

        }while (number>5000);
        int sum =0;
        for (int i = 1; i <= number; i++) {
            if (number%i ==0){
                if (i%2 ==0){
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
    }
}
