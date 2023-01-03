package Contror.contror;

import Model.Ser.EmployeeSer.EmployeeSer;
import Model.model.Person.Employee;


import java.util.Scanner;

public class ImployeeMethod {
    public void imloyeeMethod(){
        Scanner scanner = new Scanner(System.in);
        EmployeeSer employeeSer = new EmployeeSer();
        int menu=0;
        do{
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tDelete employee");
            System.out.println("4\tEdit employee");

            System.out.println("5\tReturn main menu");
            try{
                menu = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException n){
                n.printStackTrace();
            }

            switch (menu) {
                case 1:
                    employeeSer.list();
                    break;
                case 2:
                    System.out.println("Nhập Tên nhân viên");
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
                    System.out.println("Trình độ:");
                    String lever = scanner.nextLine();
                    System.out.println("Chức vụ:");
                    String position = scanner.nextLine();
                    System.out.println("Lương:");
                    int salary = Integer.parseInt(scanner.nextLine());
                    Employee employee = new Employee(nameEmployee, gender, dateOfBrith, numberCMNN, numberPhone, email, id, lever, position, salary);
                    employeeSer.add(employee);
                    break;
                case 3:
                    System.out.println("Seach id:");
                    int seachIdDelete = Integer.parseInt(scanner.nextLine());
                    Employee employee1 = employeeSer.findById(seachIdDelete);
                    if (employee1 != null) {
                        employeeSer.delete(employee1);
                    } else {
                        try {
                            throw new ExceptionFormat("ExceptionFormat");
                        } catch (ExceptionFormat e) {
                            throw new RuntimeException(e);
                        }

                    }
                    break;
                case 4:
                    System.out.print("Hãy nhập id của nhân viên muốn điều chỉnh: ");
                    id = Integer.parseInt(scanner.nextLine());
                    Employee employee2 = employeeSer.findById(id);
                    if (employee2 != null) {
                        int choiceEditEmployee = 0;
                        do {
                            System.out.println("---Các thông tin có thể sửa---\n" +
                                    "1. Tên\n" +
                                    "2. Ngày sinh\n" +
                                    "3. Giới tính\n" +
                                    "4. Số CMND\n" +
                                    "5. Số điện thoại\n" +
                                    "6. Email\n" +
                                    "7. Học vấn\n" +
                                    "8. Vị trí\n" +
                                    "9. lương");
                            System.out.print("Hãy nhập thông tin bạn muốn sửa: ");
                            choiceEditEmployee = Integer.parseInt(scanner.nextLine());
                            switch (choiceEditEmployee) {
                                case 1:
                                    System.out.print("Hãy nhập tên mới: ");
                                    String newName = scanner.nextLine();
                                    employee2.setNamePerson(newName);
                                    break;
                                case 2:
                                    System.out.print("Hãy nhập ngày sinh mới: ");
                                    String newDateOfBirth = scanner.nextLine();
                                    employee2.setDateOfBirth(newDateOfBirth);
                                    break;
                                case 3:
                                    System.out.print("Hãy nhập giới tính mới: ");
                                    String newGender = scanner.nextLine();
                                    employee2.setGender(newGender);
                                    break;
                                case 4:
                                    System.out.print("Hãy nhập số CMND mới: ");
                                    String newIndentityNumber = scanner.nextLine();
                                    employee2.setNumberCMND(newIndentityNumber);
                                    break;
                                case 5:
                                    System.out.print("Hãy nhập số điện thoại mới: ");
                                    String newPhoneNumber = scanner.nextLine();
                                    employee2.setNumberPhone(newPhoneNumber);
                                    break;
                                case 6:
                                    System.out.print("Hãy nhập email mới: ");
                                    String newEmail = scanner.nextLine();
                                    employee2.setEmail(newEmail);
                                    break;
                                case 7:
                                    System.out.print("Hãy nhập trình độ học vấn mới: ");
                                    String newAcademicLevel = scanner.nextLine();
                                    employee2.setLevelEmloyee(newAcademicLevel);
                                    break;
                                case 8:
                                    System.out.print("Hãy nhập vị trí mới: ");
                                    String newWorkingPosition = scanner.nextLine();
                                    employee2.setPosition(newWorkingPosition);
                                    break;
                                case 9:
                                    System.out.print("Hãy nhập lương mới: ");
                                    int newSalary = Integer.parseInt(scanner.nextLine());
                                    employee2.setSalary(newSalary);
                                    break;
                            }
                        } while (choiceEditEmployee < 10);
                        employeeSer.edit(employee2);
                    } else {
                        System.out.println("Hãy nhập đúng id");
                    }
                    break;

            }
        } while(menu<5);
    }

}
