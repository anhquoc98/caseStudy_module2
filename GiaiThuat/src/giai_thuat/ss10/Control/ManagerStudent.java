package giai_thuat.ss10.Control;

import giai_thuat.ss10.modol.Service.ServiceStudent;
import giai_thuat.ss10.modol.Student;
import sun.security.x509.UniqueIdentity;

import java.util.Scanner;

public class ManagerStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceStudent serviceStudent = new ServiceStudent();
        int menu = 0;
        do {
            System.out.println("1.Hiển thị");
            System.out.println("2.Thêm vào");
            System.out.println("3.Xoá");
            System.out.println("4.Chỉnh sửa");
            System.out.println("5.Tìm kiếm theo id");
            System.out.print("Mời bạn nhập số");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    serviceStudent.list();
                    break;
                case 2:
                    System.out.println("Nhập id:");
                    String id = scanner.nextLine();
                    System.out.println("Nhập tên:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String gender = scanner.nextLine();
                    System.out.println("Nhập điểm :");
                    int point =Integer.parseInt(scanner.nextLine());
                    Student student = new Student(id, name, gender,point);
                    serviceStudent.add(student);
                    break;
                case 3:
                    System.out.println("seach id: ");
                    String idRemove = scanner.nextLine();
                    Student student1 = serviceStudent.findById(idRemove);
                    if (student1 != null) {
                        serviceStudent.delede(student1);
                    }
                    break;
                case 4:
                    System.out.println("Nhập id học sinh bạn muốn chỉnh sửa");
                    String idEdit = scanner.nextLine();
                    Student student2 = serviceStudent.findById(idEdit);
                    if (student2 != null) {
                        int editId = 0;
                        do {
                            System.out.println("1.Bạn muốn sữa theo tên");
                            System.out.println("2.Bạn muốn sữa theo Giới tính :)))");
                            editId = Integer.parseInt(scanner.nextLine());
                            switch (editId) {
                                case 1:
                                    System.out.println("Nhập tên mới:");
                                    String newName = scanner.nextLine();
                                    student2.setNameStudent(newName);
                                    break;
                                case 2:
                                    System.out.println("Nhập giới tính mới");
                                    String newGender = scanner.nextLine();
                                    student2.setGender(newGender);
                                    break;

                            }
                        } while (editId < 3);
                    }
                    serviceStudent.edit(student2);
                    break;
                case 5:
                    int choice=0;
                    do {
                        System.out.println("Tìm kiếm");
                        System.out.println("1 theo Id:");
                        System.out.println("2 theo Tên");
                        choice=Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("tìm kiếm theo id");
                                String seachId=scanner.nextLine();
                                Student student3 =serviceStudent.findById(seachId);
                                System.out.println(student3);
                                break;
                            case 2:
                                System.out.println("Tìm kiếm theo tên");
                                String seachName=scanner.nextLine();
                                Student student4=serviceStudent.findByName(seachName);
                                System.out.println(student4);
                                break;
                        }
                    }while(choice<3);
                case 6:
            }
        } while (menu < 6);
    }
}
