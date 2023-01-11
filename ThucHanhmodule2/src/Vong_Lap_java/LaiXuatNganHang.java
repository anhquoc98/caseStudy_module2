package Vong_Lap_java;

import java.util.Scanner;

public class LaiXuatNganHang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Số tháng vay");
        int month =Integer.parseInt(scanner.nextLine());
        System.out.println("Số tiền vay");
        double money =Integer.parseInt(scanner.nextLine());
        System.out.println("Lãi suất theo tháng");
        double month$ =(6.5/100)/12;
        double tienTra=0;
        for (int i = 0; i < month; i++) {
            tienTra +=money*month$*month;
        }
        System.out.println("tiền ngân hàng phải trả"+tienTra);
    }
}
