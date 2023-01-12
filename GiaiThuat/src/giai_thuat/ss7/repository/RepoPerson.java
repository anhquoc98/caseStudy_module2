package giai_thuat.ss7.repository;

import giai_thuat.ss7.modol.Student;
import giai_thuat.ss7.modol.Teacher;

import java.util.ArrayList;
import java.util.List;

public class RepoPerson implements IRepoPerson {
    static List<Student> studentList = new ArrayList<>();
    static List<Teacher> teacherList = new ArrayList<>();

    static {
        studentList.add(new Student("Lion Messi", "10t", "1232", "dsacnjsa@gmail.com", "Thiên tài"));
        studentList.add(new Student("Ricadol Kaka", "10t", "1232", "dsacnjsa@gmail.com", "Giỏi"));
        studentList.add(new Student("Nguyễn Tuấn Anh", "10t", "1232", "dsacnjsa@gmail.com", "Khá"));
        teacherList.add(new Teacher("Sir Alex", "30t", "3214", "Công và công"));
        teacherList.add(new Teacher("Morinho", "30t", "3214", "Dựng xe buýt"));
        teacherList.add(new Teacher("Zidan", "30t", "3214", "Chuyền banh cho Ronaldo"));
    }

    @Override
    public void list() {
        for (Student student : studentList) {
            System.out.println(student);
        }
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }
}
