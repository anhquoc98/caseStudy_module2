package Modol.data;

import Modol.SoTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class IOSoTietKiem {

    public static final String FILE_PATH = "D:\\Codegyme\\module\\thi_thuc_hanh\\src\\Modol\\data\\SoTietKiem.csv";

    public static List<SoTietKiem> readfile() {
        List<SoTietKiem> soTietKiemList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String[] temp;
            String line;
            SoTietKiem soTietKiem;
            while ((line =bufferedReader.readLine()) != null) {
                temp = line.split("");
//                int id = Integer.parseInt(temp[0]);
//                String maTietLiem = temp[1];
//                String tenKhachHang = temp[2];
//                int soTien = Integer.parseInt(temp[3]);
//                String kiHang = temp[4];
//                double laiXuat = Double.parseDouble(temp[5]);
                soTietKiem = new SoTietKiem(Integer.parseInt(temp[0]),temp[1],temp[2],Integer.parseInt(temp[3]),temp[4],Double.parseDouble(temp[5]));
                soTietKiemList.add(soTietKiem);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return soTietKiemList;
    }

    public static void writeFile(List<SoTietKiem> soTietKiemList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SoTietKiem soTietKiem : soTietKiemList) {
                bufferedWriter.write(soTietKiem.toStringCSV());
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
