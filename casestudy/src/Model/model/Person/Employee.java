package Model.model.Person;

import Model.model.Person.Person;

public class Employee extends Person {
    private int idEmployee;
    private String levelEmloyee;
    private String position;
    private int salary;

    public Employee() {
    }


    public Employee(String namePerson, String gender, String dateOfBirth, String numberCMND, String numberPhone, String email, int idEmployee, String levelEmloyee, String position, int salary) {
        super(namePerson, gender, dateOfBirth, numberCMND, numberPhone, email);
        this.idEmployee = idEmployee;
        this.levelEmloyee = levelEmloyee;
        this.position = position;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelEmloyee() {
        return levelEmloyee;
    }

    public void setLevelEmloyee(String levelEmloyee) {
        this.levelEmloyee = levelEmloyee;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee.csv{" +
                "idEmployee=" + idEmployee +
                super.toString()+
                ", levelEmloyee='" + levelEmloyee + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String coverToCSV() {
        String comma = ",";
        return super.coverToCSV() + comma + this.idEmployee + comma + this.levelEmloyee + comma + this.position+comma+this.salary;
    }
}
