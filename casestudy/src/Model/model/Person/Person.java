package Model.model.Person;

public abstract class Person {
    private String namePerson;
    private String gender;
    private String dateOfBirth;
    private String numberCMND;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String namePerson, String gender, String dateOfBirth, String numberCMND, String numberPhone, String email) {
        this.namePerson = namePerson;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberCMND = numberCMND;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(String numberCMND) {
        this.numberCMND = numberCMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", numberCMND='" + numberCMND + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String coverToCSV(){
        final String COMMA= ",";
        return this.namePerson+COMMA+this.gender+COMMA+this.dateOfBirth+COMMA+this.numberCMND+COMMA+this.numberCMND+COMMA+this.email;
    }
}
