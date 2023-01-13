package giai_thuat.ss10.modol;

public class Student {
    private String idStudent;
    private String nameStudent;
    private String Gender;
    private int point;

    public Student(String idStudent, String nameStudent, String gender, int point) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        Gender = gender;
        this.point = point;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", Gender='" + Gender + '\'' +
                ", point=" + point +
                '}';
    }
    public String toStringCSV(){
        final String COMMA=",";
        return this.idStudent+COMMA+this.nameStudent+COMMA+this.Gender+COMMA+this.point;
    }
}
