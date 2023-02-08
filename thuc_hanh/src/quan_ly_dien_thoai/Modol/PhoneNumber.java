package quan_ly_dien_thoai.Modol;

public class PhoneNumber implements Comparable<PhoneNumber> {
    private String namePhone;
    private String phone;

    public PhoneNumber(String namePhone, String phone) {
        this.namePhone = namePhone;
        this.phone = phone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "namePhone='" + namePhone + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return this.namePhone.compareTo(o.namePhone);
    }
}
