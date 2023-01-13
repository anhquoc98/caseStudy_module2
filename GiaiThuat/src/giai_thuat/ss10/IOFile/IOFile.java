package giai_thuat.ss10.IOFile;

import giai_thuat.ss10.modol.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static final String FILE_PATH = "D:\\Codegyme\\module\\GiaiThuat\\src\\giai_thuat\\ss10\\IOFile\\IOStudent.csv";

    public static List<Student> readFile() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;

        List<Student> studentList = new ArrayList<>();
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            Student student =null;
            String[] temp;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                temp=line.split(",");
                String id =temp[0];
                String name=temp[1];
                String gender=temp[2];
                int point = Integer.parseInt(temp[3]);
                student =new Student(id,name,gender,point);
            }
            studentList.add(student);

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
        return studentList;
    }
    public static void writeFile(List<Student> students){
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter =new FileWriter(FILE_PATH);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (Student student:students){
                bufferedWriter.write(student.toStringCSV());
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
