package giai_thuat.ss10.modol.Service;

import giai_thuat.ss10.modol.Student;

public interface IServiceStudent {
    void list();
    void add(Student student);
    void delede(Student student);
    void edit(Student student);
    Student findById(String id);
    Student findByName(String name);
    void sort();
}
