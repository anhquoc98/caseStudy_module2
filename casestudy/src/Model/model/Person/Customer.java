package Model.model.Person;

public class Customer extends Person {
    int idCustomer;
    String meber;
    String address;

    public Customer() {
    }

    public Customer(String namePerson, String gender, String dateOfBirth, String numberCMND, String numberPhone, String email, int idCustomer, String meber, String address) {
        super(namePerson, gender, dateOfBirth, numberCMND, numberPhone, email);
        this.idCustomer = idCustomer;
        this.meber = meber;
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getMeber() {
        return meber;
    }

    public void setMeber(String meber) {
        this.meber = meber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", meber='" + meber + '\'' +
                ", address='" + address + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", numberCMND='" + numberCMND + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
