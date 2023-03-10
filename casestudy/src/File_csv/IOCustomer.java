package File_csv;



import Model.model.Person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class IOCustomer {
    public static final String FILE_CUSTOMER = "D:\\Codegyme\\module\\casestudy\\src\\File_csv\\Custom.csv";

    public static List<Customer> readCustomer() {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_CUSTOMER);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String nameEmployee = temp[0];
                String gender = temp[1];
                String dateOfBrith = temp[2];
                String numberCMNN = temp[3];
                String numberPhone = temp[4];
                String email = temp[5];
                int id = Integer.parseInt(temp[6]);
                String meber = temp[7];
                String address = temp[8];
                customer = new Customer(nameEmployee, gender, dateOfBrith, numberCMNN, numberPhone, email, id, meber, address);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return customerList;
    }

    public static void writeCustomer(List<Customer> customer){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
             fileWriter =new FileWriter(FILE_CUSTOMER);
             bufferedWriter =new BufferedWriter(fileWriter);
            for (Customer customer1:customer){
                bufferedWriter.write(customer1.coverToCSV());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
