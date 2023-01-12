package giai_thuat.ss7.modol;

import giai_thuat.ss7.modol.Person;

public class Teacher extends Person {
    private String idTeacher;
    private String teaching;

    public Teacher(String namePerson, String agePerson, String idTeacher, String teaching) {
        super(namePerson, agePerson);
        this.idTeacher = idTeacher;
        this.teaching = teaching;
    }

    public Teacher(String namePerson, String agePerson) {
        super(namePerson, agePerson);
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "idTeacher='" + idTeacher + '\'' +
                ", teaching='" + teaching + '\'' +
                '}';
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching;
    }
}
