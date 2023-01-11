package giai_thuat.ss4.control;

import giai_thuat.ss4.modol.service.TeacherService;

import java.util.Scanner;

public class ManagerTeacher {
    public static void main(String[] args) {
        TeacherService teacherService=new TeacherService();
        Scanner scanner=new Scanner(System.in);
        int menu =0;
        do {
            System.out.println("1.hiển thị Teacher");
            menu=Integer.parseInt(scanner.nextLine());
            switch (menu){
                case 1:
                    teacherService.list();
            }
        }while (menu<3);
    }
}
