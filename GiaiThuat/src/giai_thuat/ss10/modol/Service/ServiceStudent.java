package giai_thuat.ss10.modol.Service;

import giai_thuat.ss10.modol.Repository.RepoStudent;
import giai_thuat.ss10.modol.Student;

public class ServiceStudent implements IServiceStudent{
RepoStudent repoStudent=new RepoStudent();
    @Override
    public void list() {
        repoStudent.list();
    }

    @Override
    public void add(Student student) {
repoStudent.add(student);
    }
}
