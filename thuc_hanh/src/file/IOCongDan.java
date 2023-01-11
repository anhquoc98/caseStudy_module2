package file;

import modol.CongDan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOCongDan {

    public static final String FILE_CONGDAN = "D:\\Codegyme\\module\\thuc_hanh\\src\\file\\congdan.csv";

    public static List<CongDan> readfile() {
        List<CongDan> congDanList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader(FILE_CONGDAN);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            CongDan congDan;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String nameCongDan = temp[1];
                String email = temp[2];
                String diaChi = temp[3];
                congDan = new CongDan(id, nameCongDan, email, diaChi);
                congDanList.add(congDan);
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
        return congDanList;
    }

    public static void writer(List<CongDan> congDanList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_CONGDAN);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CongDan congDan : congDanList) {
                bufferedWriter.write(congDan.toStringCSV());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
