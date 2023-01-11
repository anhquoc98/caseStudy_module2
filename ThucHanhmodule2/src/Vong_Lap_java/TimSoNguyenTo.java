package Vong_Lap_java;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int soNguyenTo=Integer.parseInt(scanner.nextLine());
        int count =0;
        for (int i = 1; i <=soNguyenTo ; i++) {
            if (soNguyenTo%i==0){
                count ++;
            }
        }
        if (count ==2){
            System.out.println(soNguyenTo +"la so nguyen to");
        }
        else {
            System.out.println(soNguyenTo+"khong phai so nguyen to");
        }
    }
}
