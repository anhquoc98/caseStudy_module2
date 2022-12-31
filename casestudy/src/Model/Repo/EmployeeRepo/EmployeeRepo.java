package Model.Repo.EmployeeRepo;


import File_csv.IOEmployee;
import Model.model.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("Nguyễn Văn A", "Nam", "10/11/1994", "201748312", "0904321949", "exmap@gmail.com", 1, "Đại học", "Giám đốc", 3000));
        employeeList.add(new Employee("Nguyễn Văn B", "Nam", "10/1/1984", "201748432", "0904678849", "exmadffdp@gmail.com", 2, "Sau Đại học", "Quản lý", 2000));
        employeeList.add(new Employee("Nguyễn Văn C", "Nữ", "12/4/2000", "20174765", "0904367838", "exmaprew@gmail.com", 3, "Cao Đẳng", "Giám sát", 1000));
        employeeList.add(new Employee("Nguyễn Văn D", "Nữ", "31/5/1999", "201742322", "0904336389", "exytmap@gmail.com", 4, "Trung cấp", "Chuyên Viên", 500));
        employeeList.add(new Employee("Nguyễn Văn E", "Nữ", "10/6/1988", "201748652", "0904329805", "exmaácp@gmail.com", 5, "Đại học", "Phục vụ", 300));
        employeeList.add(new Employee("Nguyễn Văn F", "Nam", "25/11/1998", "203569312", "0904321643", "exmaưewp@gmail.com", 6, " Sau Đại học", "Lễ Tân", 250));
    }

    @Override
    public void list() {
        for (Employee c : employeeList) {
            System.out.println(c);
        }
        employeeList =IOEmployee.readEmloyee();
    }



    @Override
    public void delete(Employee employee) {
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getIdEmployee()==employee.getIdEmployee()){
                employeeList.remove(employee);
            }
        }
    }

    @Override
    public Employee findById(int id) {
        for (Employee employee:employeeList){
            if (employee.getIdEmployee()==id){
                return employee;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        for (int i = 0; i <employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee()==employee.getIdEmployee()){
                employeeList.set(i,employee);
            }
        }
    }


    @Override
    public void add(Object object) {
        employeeList.add((Employee) object);
        IOEmployee.writeEmployee(employeeList);
    }
}
