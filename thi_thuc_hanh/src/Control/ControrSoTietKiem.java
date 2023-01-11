package Control;

import Modol.Repository.SoTietKiemRepo;
import Modol.SoTietKiem;

import java.util.Scanner;

import static Control.Regex.SOTIETKIEM;

public class ControrSoTietKiem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        SoTietKiemRepo soTietKiemRepo=new SoTietKiemRepo();
        int menu =0;
        do {
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Đăng kí sổ tiết kiệm");
            System.out.println("3.Thoát");
            menu =Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    soTietKiemRepo.list();
                    break;
                case 2:
                    System.out.println("Số thứ tự");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Mã sổ tiết Kiệm");
                    String maSoTietKiem;
                    do {
                        maSoTietKiem = scanner.nextLine();
                        if (!(maSoTietKiem + "").matches(Regex.SOTIETKIEM)) {
                            System.out.println("Nhập lại sổ tiết kiệm");
                        }
                    } while (!(maSoTietKiem + "").matches(Regex.SOTIETKIEM));

                    System.out.println("Tên khách hàng");
                    String tenKhachHang = scanner.nextLine();
                    System.out.println("Số tiền");
                    int soTien = Integer.parseInt(scanner.nextLine());
                    System.out.println("Kì hạng");
                    String kyHang;
                    do {
                        kyHang = scanner.nextLine();
                        if (!(kyHang + "").matches(Regex.KYHANG)) {
                            System.out.println("nhập lại kì hạng");
                        }
                    } while (!(kyHang + "").matches(Regex.KYHANG));

                    System.out.println("Lãi Xuất");
                    double laiXuat = Double.parseDouble(scanner.nextLine());
                    SoTietKiem soTietKiem = new SoTietKiem(id, maSoTietKiem, tenKhachHang, soTien, kyHang, laiXuat);
                    soTietKiemRepo.add(soTietKiem);
                    break;
                case 3:
                    System.out.println("");
            }
        }while (menu<3);
    }
}
