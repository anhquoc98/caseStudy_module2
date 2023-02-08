package quan_ly_dien_thoai;

import quan_ly_dien_thoai.Modol.PhoneNumber;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {

    public static final String FILE_PATH = "D:\\Codegyme\\module\\thuc_hanh\\src\\quan_ly_dien_thoai\\IOPhone.csv";

    public static List<PhoneNumber> readFile(){
    List<PhoneNumber> phoneNumberList =new ArrayList<>();
    FileReader fileReader=null;
    BufferedReader bufferedReader =null;
    try {
        fileReader= new FileReader(FILE_PATH);
        bufferedReader=new BufferedReader(fileReader);
        PhoneNumber phoneNumber;
        String line;
        String []temp;
        while ((line =bufferedReader.readLine())!=null){
            temp=line.split(",");
            String namePhone=temp[0];
            String phone =temp[1];
            phoneNumber=new PhoneNumber(namePhone,phone);
            phoneNumberList.add(phoneNumber);
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    finally {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    return phoneNumberList;
    }
    public static void writeFile(List<PhoneNumber> phoneNumbers){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter =null;
        try {
             fileWriter=new FileWriter(FILE_PATH);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (PhoneNumber phoneNumber:phoneNumbers){
                bufferedWriter.write(phoneNumber.getNamePhone()+","+phoneNumber.getPhone());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
