package giai_thuat.ss7.modol;

import giai_thuat.ss7.modol.Person;

public class Student extends Person {
    private String idStudent;
    private String email;
    private String study;

    public Student(String namePerson, String agePerson, String idStudent, String email, String study) {
        super(namePerson, agePerson);
        this.idStudent = idStudent;
        this.email = email;
        this.study = study;
    }

    public Student(String namePerson, String agePerson) {
        super(namePerson, agePerson);
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "idStudent='" + idStudent + '\'' +
                ", email='" + email + '\'' +
                ", study='" + study + '\'' +
                '}';
    }
}
