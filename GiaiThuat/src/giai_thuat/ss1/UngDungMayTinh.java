package giai_thuat.ss1;

import java.util.Scanner;

public class UngDungMayTinh {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số thứ 1");
        int number =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ 2");
        int number1 =Integer.parseInt(scanner.nextLine());
        double result;
        System.out.println("1.cộng");
        System.out.println("2.trừ");
        System.out.println("3.nhân");
        System.out.println("4.chia");
        int menu =Integer.parseInt(scanner.nextLine());

        switch (menu){
            case 1:
               result=number1+number;
                System.out.println(result);
               break;
            case 2:
                result=number-number1;
                System.out.println(result);
                break;
            case 3:
                result=number*number1;
                System.out.println(result);
                break;
            case 4:
                result=number/number1;
                System.out.println(result);
                break;
            default:
                System.out.println("Kết quả ko hợp lệ");
        }

    }
}
