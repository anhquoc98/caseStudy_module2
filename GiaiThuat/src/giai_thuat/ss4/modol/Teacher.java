package giai_thuat.ss4.modol;

public class Teacher {
    private String nameTeacher;
    private String oldTeacher;
    private String address;
    private String email;
    private String numberPhone;
    private String classTeacher;

    public Teacher(String nameTeacher, String oldTeacher, String address, String email, String numberPhone, String classTeacher) {
        this.nameTeacher = nameTeacher;
        this.oldTeacher = oldTeacher;
        this.address = address;
        this.email = email;
        this.numberPhone = numberPhone;
        this.classTeacher = classTeacher;
    }

    public Teacher() {
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getOldTeacher() {
        return oldTeacher;
    }

    public void setOldTeacher(String oldTeacher) {
        this.oldTeacher = oldTeacher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameTeacher='" + nameTeacher + '\'' +
                ", oldTeacher='" + oldTeacher + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                '}';
    }
}
