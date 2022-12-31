package Contror.contror;

import Model.Ser.CustomerSer.CustomerSer;

import Model.model.Person.Customer;

import java.util.Scanner;

public class CustomerMethod {




    public void customerMethod(){
        Scanner scanner=new Scanner(System.in);
        CustomerSer customerSer= new CustomerSer();
        int menu;
        do {
            System.out.println("1\tDisplay list customers");
            System.out.println("2\tAdd new customers");
            System.out.println("3\tEdit customers");
            System.out.println("4\tReturn main menu");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {

                case 1:
                    customerSer.list();
                    break;
                case 2:
                    System.out.println("Nhập Tên ");
                    String nameEmployee = scanner.nextLine();
                    System.out.println("Giới tính :");
                    String gender = scanner.nextLine();
                    System.out.println("Ngày sinh:");
                    String dateOfBrith = scanner.nextLine();
                    System.out.println("Chứng minh nhân dân:");
                    String numberCMNN = scanner.nextLine();
                    System.out.println("Số điện thoai");
                    String numberPhone = scanner.nextLine();
                    System.out.println("Email:");
                    String email = scanner.nextLine();
                    System.out.println("Id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Meber:");
                    String meber = scanner.nextLine();
                    System.out.println("address:");
                    String address = scanner.nextLine();
                    Customer customer =new Customer(nameEmployee,gender,dateOfBrith,numberCMNN,numberPhone,email,id,meber,address);
                    customerSer.add(customer);
break;

                case 3:
                    System.out.print("Hãy nhập id của nhân viên muốn điều chỉnh: ");
                    id = Integer.parseInt(scanner.nextLine());
                    Customer customer1=customerSer.findById(id);
                    if (customer1 != null) {
                        int choiceEditEmployee = 0;
                        do {
                            System.out.println("---Các thông tin có thể sửa---\n" +
                                    "1. Tên\n" +
                                    "2. Ngày sinh\n" +
                                    "3. Giới tính\n" +
                                    "4. Số CMND\n" +
                                    "5. Số điện thoại\n" +
                                    "6. Email\n" +
                                    "7. Meber\n" +
                                    "8. Address\n");
                            System.out.print("Hãy nhập thông tin bạn muốn sửa: ");
                            choiceEditEmployee = Integer.parseInt(scanner.nextLine());
                            switch (choiceEditEmployee) {
                                case 1:
                                    System.out.print("Hãy nhập tên mới: ");
                                    String newName = scanner.nextLine();
                                    customer1.setNamePerson(newName);
                                    break;
                                case 2:
                                    System.out.print("Hãy nhập ngày sinh mới: ");
                                    String newDateOfBirth = scanner.nextLine();
                                    customer1.setDateOfBirth(newDateOfBirth);
                                    break;
                                case 3:
                                    System.out.print("Hãy nhập giới tính mới: ");
                                    String newGender = scanner.nextLine();
                                    customer1.setGender(newGender);
                                    break;
                                case 4:
                                    System.out.print("Hãy nhập số CMND mới: ");
                                    String newIndentityNumber = scanner.nextLine();
                                    customer1.setNumberCMND(newIndentityNumber);
                                    break;
                                case 5:
                                    System.out.print("Hãy nhập số điện thoại mới: ");
                                    String newPhoneNumber = scanner.nextLine();
                                    customer1.setNumberPhone(newPhoneNumber);
                                    break;
                                case 6:
                                    System.out.print("Hãy nhập email mới: ");
                                    String newEmail = scanner.nextLine();
                                    customer1.setEmail(newEmail);
                                    break;
                                case 7:
                                    System.out.print("Loai khach: ");
                                    String newMeber = scanner.nextLine();
                                    customer1.setMeber(newMeber);
                                    break;
                                case 8:
                                    System.out.print("Hãy nhập address mới: ");
                                    String newAddress = scanner.nextLine();
                                    customer1.setAddress(newAddress);
                                    break;

                            }
                        } while (choiceEditEmployee <8 );
                    } else {
                        System.out.println("Hãy nhập đúng id");
                    }
                    break;
            }
        } while (menu <4);
    }
}
