package Model.Ser.CustomerSer;

import Model.Ser.ISer;
import Model.model.Person.Customer;


public interface ICustomerSer extends ISer {
    void edit(Customer customer);
    Customer findById(int id);
}
