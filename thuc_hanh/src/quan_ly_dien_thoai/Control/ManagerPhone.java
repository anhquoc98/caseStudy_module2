package quan_ly_dien_thoai.Control;

import quan_ly_dien_thoai.Modol.PhoneNumber;
import quan_ly_dien_thoai.Modol.Service.ServicePhone;

import java.util.Scanner;

public class ManagerPhone {
    public static void main(String[] args) {
        ServicePhone servicePhone =new ServicePhone();
        Scanner scanner =new Scanner(System.in);
        int menu =0;
        do {

            System.out.println("-----Manager Phone Number-----");
            System.out.println("1.display");
            System.out.println("2.add");
            System.out.println("3.seach name");
            System.out.println("4.remove name");
            System.out.println("5.edit name");
            menu =Integer.parseInt(scanner.nextLine());
            switch (menu){
                case 1:
                    servicePhone.display();
                    break;
                case 2:
                    System.out.println("Input Name:");
                    String namePhone =scanner.nextLine();
                    System.out.println("Input Phone:");
                    String numberPhone =scanner.nextLine();
                    servicePhone.add(new PhoneNumber(namePhone,numberPhone));
                    break;
                case 3:
                    System.out.println("Input NameSeach:");
                    String nameSeach=scanner.nextLine();
                    PhoneNumber phoneNumber =servicePhone.seachByPhone(nameSeach);
                    if (phoneNumber !=null){
                        servicePhone.seachName(phoneNumber);
                    }
                    else {
                        System.out.println("No Seach Name");
                    }
                    break;
                case 4:
                    System.out.println("Input NameDelete:");
                    String nameDelete=scanner.nextLine();
                    PhoneNumber phoneNumber1 =servicePhone.seachByPhone(nameDelete);
                    if (phoneNumber1 !=null){
                        servicePhone.delede(phoneNumber1);
                    }
                    break;
                case 5:
                    System.out.println("Input NameEdit:");
                    String nameEdit =scanner.nextLine();
                    PhoneNumber phoneNumber2=servicePhone.seachByPhone(nameEdit);
                    if (phoneNumber2!= null){
                        System.out.println("1.Edit Name");
                        System.out.println("2.Edit Phone");
                        int choice =Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("Input Name:");
                                String inputName=scanner.nextLine();
                                phoneNumber2.setNamePhone(inputName);
                                servicePhone.update(phoneNumber2);
                                break;
                            case 2:
                                System.out.println("Input phone:");
                                String inputPhone= scanner.nextLine();
                                phoneNumber2.setNamePhone(inputPhone);
                                servicePhone.update(phoneNumber2);
                                break;
                        }
                    }
                    break;
                case 6:

            }
        }while (menu<6);
    }
}
