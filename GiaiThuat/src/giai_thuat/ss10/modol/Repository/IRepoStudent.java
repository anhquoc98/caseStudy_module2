package giai_thuat.ss10.modol.Repository;

import giai_thuat.ss10.modol.Student;

public interface IRepoStudent {
    void list();
    void add(Student student);
    Student byFindid(String id);
    void edit(Student student);
    void remove(Student student);
    Student byFindName(String name);
}
