package quan_ly_dien_thoai.Modol.Repository;

import quan_ly_dien_thoai.IOFile;
import quan_ly_dien_thoai.Modol.PhoneNumber;

import java.util.*;

public class RepositoryPhone implements IRepositoryPhone {
    static List<PhoneNumber> phoneNumberList = new ArrayList<>();

    static {
        phoneNumberList.add(new PhoneNumber("a", "0987462817"));
        phoneNumberList.add(new PhoneNumber("b", "0987462817"));
        phoneNumberList.add(new PhoneNumber("c", "0987462817"));
        phoneNumberList.add(new PhoneNumber("d", "0987462817"));
        phoneNumberList.add(new PhoneNumber("e", "0987462817"));
        phoneNumberList.add(new PhoneNumber("f", "0987462817"));
        phoneNumberList.add(new PhoneNumber("g", "0987462817"));
        IOFile.writeFile(phoneNumberList);
    }

    @Override
    public void display() {
        for (PhoneNumber i : phoneNumberList) {
            System.out.println(i);
        }
        phoneNumberList=IOFile.readFile();
    }

    @Override
    public void add(PhoneNumber namePhone) {
        phoneNumberList.add(namePhone);
        IOFile.writeFile(phoneNumberList);
    }

    @Override
    public PhoneNumber seachByPhone(String namePhone) {
        for (PhoneNumber phoneNumber : phoneNumberList) {
            if (Objects.equals(phoneNumber.getNamePhone(), namePhone)) {
                return phoneNumber;
            }
        }
        return null;
    }

    @Override
    public void delede(PhoneNumber namePhone) {
        for (int i = 0; i < phoneNumberList.size(); i++) {
            if (Objects.equals(phoneNumberList.get(i).getNamePhone(), namePhone.getNamePhone())) {
                phoneNumberList.remove(namePhone);
            }
        }

    }

    @Override
    public void seachName(PhoneNumber namePhone) {
        for (int i = 0; i <phoneNumberList.size() ; i++) {
            if (Objects.equals(phoneNumberList.get(i).getNamePhone(), namePhone.getNamePhone())){
                System.out.println(phoneNumberList.get(i));
            }
        }
    }

    @Override
    public void update(PhoneNumber namephone) {
        for (int i = 0; i <phoneNumberList.size() ; i++) {
            if (Objects.equals(phoneNumberList.get(i).getNamePhone(), namephone.getPhone())){
                phoneNumberList.set(i,namephone);
            }
        }
    }

    @Override
    public void sort() {
        phoneNumberList.sort(new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return 0;
            }
        });
    }
}
