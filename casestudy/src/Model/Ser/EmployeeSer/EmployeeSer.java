package Model.Ser.EmployeeSer;


import Model.Repo.EmployeeRepo.EmployeeRepo;
import Model.model.Person.Employee;

public class EmployeeSer implements IEmployeeSer {
    EmployeeRepo employeeRepo = new EmployeeRepo();

    @Override
    public void list() {
        employeeRepo.list();
    }

    @Override
    public void add(Object object) {
        employeeRepo.add( object);
    }
    @Override
    public Employee findById(int id) {
        return employeeRepo.findById(id);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepo.delete(employee);
    }

    @Override
    public void edit(Employee employee) {
        employeeRepo.edit(employee);
    }
}
