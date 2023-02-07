package giai_thuat.ss10.modol.Service;

import giai_thuat.ss10.IOFile.IOFile;
import giai_thuat.ss10.modol.Repository.RepoStudent;
import giai_thuat.ss10.modol.Student;

public class ServiceStudent implements IServiceStudent {
    RepoStudent repoStudent = new RepoStudent();

    @Override
    public void list() {
        repoStudent.list();

    }

    @Override
    public void add(Student student) {
        repoStudent.add(student);
    }

    @Override
    public void delede(Student student) {
        repoStudent.remove(student);
    }

    @Override
    public void edit(Student student) {
        repoStudent.edit(student);

    }

    @Override
    public Student findById(String id) {

        return repoStudent.byFindid(id);
    }

    @Override
    public Student findByName(String name) {
        return repoStudent.byFindName(name);
    }

    @Override
    public void sort() {
        repoStudent.sort();
    }

}
