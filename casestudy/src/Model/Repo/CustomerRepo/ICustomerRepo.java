package Model.Repo.CustomerRepo;


import Model.Repo.IRepo;
import Model.model.Person.Customer;

public interface ICustomerRepo extends IRepo {
    void edit(Customer customer);
    Customer findById(int id);
}
