import modol.CongDan;
import modol.ser.Ser;

import java.util.Scanner;

public class contror {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Ser ser =new Ser();
        int menu;
        do {
            System.out.println("Các chức năng công nhân");
            System.out.println("1.Hiển thị");
            System.out.println("2.Thêm công nhân vào");
            menu =Integer.parseInt(scanner.nextLine());
            switch (menu){
                case 1:
                    ser.list();
                    break;
                case 2:
                    System.out.println("nhập id công dân:");
                    int id=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên công dân");
                    String nameCongDan=scanner.nextLine();
                    System.out.println("Nhập emal công dân");
                    String email =scanner.nextLine();
                    System.out.println("Nhập địa chỉ công dân");
                    String diaChi=scanner.nextLine();
                    CongDan congDan =new CongDan(id,nameCongDan,email,diaChi);
                    ser.add(congDan);
                    break;
//                case 3:
//                    System.out.println("Tên công dân bạn tìm kiềm");
//                    String seachName=scanner.nextLine();
//                    ser.findByName(seachName);
//                default:
//                    System.out.println("");
            }
        }while (menu<4);
    }
}
