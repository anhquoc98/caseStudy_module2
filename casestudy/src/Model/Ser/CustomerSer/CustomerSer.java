package Model.Ser.CustomerSer;

import Model.Repo.CustomerRepo.CustomerRepo;
import Customer;
import Model.model.Person.Customer;


public class CustomerSer implements ICustomerSer{
    CustomerRepo customerRepo=new CustomerRepo();
    @Override
    public void list() {
customerRepo.list();
    }

    @Override
    public void add(Object object) {
customerRepo.add(object);
    }

    @Override
    public void edit(Customer customer) {
        customerRepo.edit(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepo.findById(id);
    }
}
