package giai_thuat.ss5.modol;

public class Student {
    private String nameStudent;
    private String ageStudent;
    private  static String classStudent;

    public Student(String nameStudent, String ageStudent, String classStudent) {
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        Student.classStudent = classStudent;
    }

    public Student() {
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(String ageStudent) {
        this.ageStudent = ageStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "modol{" +
                "nameStudent='" + nameStudent + '\'' +
                ", ageStudent='" + ageStudent + '\'' +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
