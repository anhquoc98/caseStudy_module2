package quan_ly_dien_thoai.Modol.Service;

import quan_ly_dien_thoai.Modol.PhoneNumber;
import quan_ly_dien_thoai.Modol.Repository.RepositoryPhone;

public class ServicePhone implements IService {
    RepositoryPhone repositoryPhone = new RepositoryPhone();

    @Override
    public void display() {
        repositoryPhone.display();
    }

    @Override
    public void add(PhoneNumber namePhone) {
        repositoryPhone.add(namePhone);
    }

    @Override
    public PhoneNumber seachByPhone(String namePhone) {
        return repositoryPhone.seachByPhone(namePhone);
    }

    @Override
    public void delede(PhoneNumber namePhone) {
        repositoryPhone.delede(namePhone);
    }

    @Override
    public void seachName(PhoneNumber namePhone) {
        repositoryPhone.seachName(namePhone);
    }

    @Override
    public void update(PhoneNumber namephone) {
        repositoryPhone.update(namephone);
    }
}
