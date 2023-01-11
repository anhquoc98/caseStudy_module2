package Model.Repo.CustomerRepo;


import File_csv.IOCustomer;
import Model.model.Person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("Nguyễn Văn Dũng", "Nam", "1/4/1998", "3456285",
                "0453675457", "dfisdhfdi@gmail.com", 1, "Diamond", "21 Điện biên phủ"));
        customerList.add(new Customer("Phan Văn Đồng", "Nam", "12/4/1998", "34562095",
                "0453678860", "dfisdhfdi32@gmail.com", 2, "Platinium", "30 Điện biên phủ"));
        customerList.add(new Customer("Nguyễn Hà Anh Quốc", "Nam", "1/6/1998", "34432785",
                "0452098435", "dfisdhf3211di@gmail.com", 3, "Gold", "1 Điện biên phủ"));
        customerList.add(new Customer("Nguyễn Thanh Tú", "Nam", "1/12/1998", "34566585",
                "0453675535", "dfisdhfd11i@gmail.com", 4, "Silver", "12 Điện biên phủ"));
        customerList.add(new Customer("Nguyễn Thị Thuỷ", "Nử", "10/3/1998", "34562125",
                "0453678995", "dfisdhfd76i@gmail.com", 5, "Member", "99 Điện biên phủ"));

    }

    @Override
    public void edit(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer() == customer.getIdCustomer()) {
                customerList.set(i, customer);
            }
        }
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customerList) {
            if (customer.getIdCustomer() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void list() {

        for (Customer c : customerList) {
            System.out.println(c);
        }
        customerList = IOCustomer.readCustomer();
    }

    @Override
    public void add(Object object) {
        customerList.add((Customer) object);
        IOCustomer.writeCustomer(customerList);
    }
}
