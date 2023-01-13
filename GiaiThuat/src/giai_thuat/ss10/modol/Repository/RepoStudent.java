package giai_thuat.ss10.modol.Repository;

import giai_thuat.ss10.IOFile.IOFile;
import giai_thuat.ss10.modol.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RepoStudent implements IRepoStudent {
    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("1", "Anh Quốc", "Nam",100));
        studentList.add(new Student("2", "Anh Quân", "Nam",99));
        studentList.add(new Student("3", "Anh Đào", "Nam",90));
    }

    @Override
    public void list() {
        for (Student student : studentList) {
            System.out.println(student);
        }
        studentList=IOFile.readFile();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
        IOFile.writeFile(studentList);
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
        } IOFile.writeFile(studentList);
    }

    @Override
    public void remove(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (Objects.equals(studentList.get(i).getIdStudent(), student.getIdStudent())){
                studentList.remove(student);
            }
        }
        studentList=IOFile.readFile();
    }

    @Override
    public Student byFindName(String name) {
        for (Student student:studentList){
            if (Objects.equals(student.getNameStudent(),name)){
                return student;
            }
        }
        return null;
    }
}
