package giai_thuat.ss4.modol.repository;

import giai_thuat.ss4.modol.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepo implements ITeacherRepo{
static List<Teacher> teacherList=new ArrayList<>();
static {
    teacherList.add(new Teacher("Nguyễn Văn A","30 Tuoi","30 nguyễn văn trổi","dihq@gmail.com","0978345678","c1222g1"));
    teacherList.add(new Teacher("Nguyễn Văn A","30 Tuoi","30 nguyễn văn trổi","dihq@gmail.com","0978345678","c1222g1"));
    teacherList.add(new Teacher("Nguyễn Văn A","30 Tuoi","30 nguyễn văn trổi","dihq@gmail.com","0978345678","c1222g1"));
    teacherList.add(new Teacher("Nguyễn Văn A","30 Tuoi","30 nguyễn văn trổi","dihq@gmail.com","0978345678","c1222g1"));
}
    @Override
    public void list() {
        for (Teacher teacher:teacherList) {
            System.out.println(teacher);
        }
    }
}
