package giai_thuat.ss5.contror;

import giai_thuat.ss5.modol.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent {
    static final String REGEX ="^[C][0-9]{2}[2]\\d{1}(G1)$";
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Vui Lòng nhập tên lớp học");
        String classStudent;
        do {
           classStudent=scanner.nextLine();
           if (!classStudent.matches(REGEX)){
               System.out.println("Nhập chưa đúng tên lớp vui lòng nhập lại");
           }
        }while (!classStudent.matches(REGEX));
        List<Student> studentList=new ArrayList<>();
        Student student=new Student("Anh Quốc","20t",classStudent);
        Student student1=new Student("Quốc Anh","21t",classStudent);
        studentList.add(student);
        studentList.add(student1);
        for (Student student2:studentList){
            System.out.println(student2);
        }
        System.out.println("lớp học sau khi thay đổi");
        String classStudent1;
        do {
            classStudent1=scanner.nextLine();
            if (classStudent.matches(REGEX)){
                System.out.println("Nhập chưa đúng tên lớp vui lòng nhập lại");
            }
        }while (!classStudent1.matches(REGEX));
        student.setClassStudent(classStudent1);
        for (Student student2:studentList){
            System.out.println(student2);
        }
    }
}
