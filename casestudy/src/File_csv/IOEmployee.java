package File_csv;


import Model.model.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOEmployee {

    public static final String FILE_EMLOYEE = "D:\\Codegyme\\module\\casestudy\\src\\File_csv\\Employee.csv";

    public static List<Employee> readEmloyee() throws RuntimeException {
        List<Employee> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_EMLOYEE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String nameEmployee = temp[0];
                String gender = temp[1];
                String dateOfBrith = temp[2];
                String numberCMNN = temp[3];
                String numberPhone = temp[4];
                String email = temp[5];
                int id = Integer.parseInt(temp[6]);
                String leverEmloyee = temp[7];
                String positition = temp[8];
                int salary = Integer.parseInt(temp[9]);
                employee = new Employee(nameEmployee, gender, dateOfBrith, numberCMNN, numberPhone, email, id, leverEmloyee,positition,salary);
                customerList.add(employee);
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

    public static void writeEmployee(List<Employee> employees){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter =new FileWriter(FILE_EMLOYEE);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (Employee employee1:employees){
                bufferedWriter.write(employee1.coverToCSV());
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
