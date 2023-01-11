package giai_thuat.ss4.modol.service;

import giai_thuat.ss4.modol.repository.TeacherRepo;

public class TeacherService implements ITeacherSer{
    TeacherRepo teacherRepo=new TeacherRepo();
    @Override
    public void list() {
        teacherRepo.list();
    }
}
