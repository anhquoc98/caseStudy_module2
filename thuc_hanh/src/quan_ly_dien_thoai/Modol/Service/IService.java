package quan_ly_dien_thoai.Modol.Service;

import quan_ly_dien_thoai.Modol.PhoneNumber;

public interface IService {
    void display();

    void add(PhoneNumber namePhone);

    PhoneNumber seachByPhone(String namePhone);

    void delede(PhoneNumber namePhone);

    void seachName(PhoneNumber namePhone);

    void update(PhoneNumber namephone);
}
