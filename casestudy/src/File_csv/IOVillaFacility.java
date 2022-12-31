package File_csv;

import Model.model.Facility.RoomFacility;
import Model.model.Facility.VillaFacility;
import Model.model.Person.Customer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IOVillaFacility {

    public static final String FILE_VILLA = "D:\\Codegyme\\module\\casestudy\\src\\File_csv\\FacilityVilla.csv";

    public static Map<VillaFacility, Integer> readRoomFacility() {
        Map<VillaFacility,Integer> facilityIntegerMap = new HashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_VILLA);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String nameFacilityVilla =temp[0];
                String areaFacilityVilla= temp[1];
                String quantityVilla =temp[2];
                String rentalType =temp[3];
                String id =temp[4];
                String moneyVilla =temp[5];
                String levelVillaFacility=temp[6];
                String areaPoolVilla=temp[7];
                String numberFloors =temp[8];

                VillaFacility villaFacility=new VillaFacility(nameFacilityVilla,areaFacilityVilla,quantityVilla,rentalType,id,moneyVilla,levelVillaFacility,areaPoolVilla,numberFloors);
                facilityIntegerMap.put(villaFacility,Integer.parseInt(temp[9]));
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

    public static void writerVillaFacility(Map<VillaFacility,Integer> villaFacilityIntegerMap){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter =new FileWriter(FILE_VILLA);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (Map.Entry<VillaFacility,Integer> villaFacilityIntegerEntry:villaFacilityIntegerMap.entrySet()){
                bufferedWriter.write(villaFacilityIntegerEntry.getKey().coverToCSV()+","+villaFacilityIntegerEntry.getValue());
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
