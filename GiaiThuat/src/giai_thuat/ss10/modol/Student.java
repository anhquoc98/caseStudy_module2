package giai_thuat.ss10.modol;

public class Student {
    private String idStudent;
    private String nameStudent;
    private String Gender;

    public Student(String idStudent, String nameStudent, String gender) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        Gender = gender;
    }

    public Student() {
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
