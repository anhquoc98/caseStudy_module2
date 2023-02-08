package quan_ly_dien_thoai.Modol.Repository;

import quan_ly_dien_thoai.Modol.PhoneNumber;

public interface IRepositoryPhone {
    void display();

    void add(PhoneNumber namePhone);

    PhoneNumber seachByPhone(String namePhone);

    void delede(PhoneNumber namePhone);

    void seachName(PhoneNumber namePhone);

    void update(PhoneNumber namephone);
    void sort();

}
