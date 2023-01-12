package giai_thuat.ss7.modol;

public class Person {
    private String namePerson;
    private String agePerson;

    public Person(String namePerson, String agePerson) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(String agePerson) {
        this.agePerson = agePerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                ", agePerson='" + agePerson + '\'' +
                '}';
    }
}
