package Model.Ser.EmployeeSer;

import Model.Ser.ISer;
import Model.model.Employee;

public interface IEmployeeSer extends ISer {

    Employee findById(int id);
    void delete(Employee employee);
    void edit (Employee employee);
}
