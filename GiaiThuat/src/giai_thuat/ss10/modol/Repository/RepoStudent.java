package giai_thuat.ss10.modol.Repository;

import giai_thuat.ss10.modol.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public Student byFindid(String id) {
        for (Student student : studentList) {
            if (Objects.equals(student.getIdStudent(), id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void edit(Student student) {
        for (int i = 0; i <studentList.size() ; i++) {
            if(Objects.equals(student.getIdStudent(), studentList.get(i).getIdStudent())){
                studentList.set(i,student);
            }
        }
    }

    @Override
    public void remove(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (Objects.equals(studentList.get(i).getIdStudent(), student.getIdStudent())){
                studentList.remove(student);
            }
        }
    }
}
