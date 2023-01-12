package giai_thuat.ss10.modol.Repository;

import giai_thuat.ss10.modol.Student;

import java.util.ArrayList;
import java.util.List;

public class RepoStudent implements IRepoStudent {
    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("1", "Anh Quốc", "Nam"));
        studentList.add(new Student("2", "Anh Quân", "Nam"));
        studentList.add(new Student("3", "Anh Đào", "Nam"));
    }

    @Override
    public void list() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }
}
