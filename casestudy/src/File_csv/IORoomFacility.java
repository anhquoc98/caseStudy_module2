package File_csv;

import Model.model.Facility.Facility;
import Model.model.Facility.RoomFacility;
import Model.model.Person.Customer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IORoomFacility {

    public static final String FILE_FACILITY = "D:\\Codegyme\\module\\casestudy\\src\\File_csv\\FacilityRoom.csv";

    public static Map<RoomFacility, Integer> readRoomFacility() {
        Map<RoomFacility,Integer> facilityIntegerMap = new HashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_FACILITY);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String nameFacilityRoom =temp[0];
                String areaFacilityRoom= temp[1];
                String quantityPeople =temp[2];
                String rentalType =temp[3];
                String id =temp[4];
                String freeService=temp[5];
                RoomFacility roomFacility=new RoomFacility(nameFacilityRoom,areaFacilityRoom,quantityPeople,rentalType,id,freeService);
                facilityIntegerMap.put(roomFacility,Integer.parseInt(temp[6]));
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
        return facilityIntegerMap;
    }

    public static void writerRoomFacility(Map<RoomFacility,Integer> roomFacilityMap){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter =new FileWriter(FILE_FACILITY);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (Map.Entry<RoomFacility,Integer> facilityIntegerMap:roomFacilityMap.entrySet()){
                bufferedWriter.write(facilityIntegerMap.getKey().coverToCSV()+","+facilityIntegerMap.getValue());
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
