package Model.Repo.EmployeeRepo;


import Model.Repo.IRepo;
import Model.model.Person.Employee;

public interface IEmployeeRepo extends IRepo {

    void delete(Employee employee);
    Employee findById(int id);

    void edit(Employee employee);
}
