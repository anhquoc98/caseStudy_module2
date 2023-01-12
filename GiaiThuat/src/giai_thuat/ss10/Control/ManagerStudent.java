package giai_thuat.ss10.Control;

import giai_thuat.ss10.modol.Service.ServiceStudent;
import giai_thuat.ss10.modol.Student;

import java.util.Scanner;

public class ManagerStudent {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ServiceStudent serviceStudent=new ServiceStudent();
        int menu =0;
        do {
            System.out.println("1.Hiển thị");
            System.out.println("2.Thêm vào");
            System.out.print("Mời bạn nhập số");
            menu=Integer.parseInt(scanner.nextLine());
            switch (menu){
                case 1:
                    serviceStudent.list();
                    break;
                case 2:
                    System.out.println("Nhập id:");
                    String id =scanner.nextLine();
                    System.out.println("Nhập tên:");
                    String name =scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String gender=scanner.nextLine();
                    Student student =new Student(id,name,gender);
                    serviceStudent.add(student);
                    break;
            }
        }while (menu<3);
    }
}
