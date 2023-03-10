package Model.Repo.FacitilyRepo;

import File_csv.IORoomFacility;
import File_csv.IOVillaFacility;
import Model.model.Facility.RoomFacility;
import Model.model.Facility.VillaFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomRepo implements IRoomFacitilyRepo {
    static Map<RoomFacility, Integer> roomFacilityIntegerMap = new LinkedHashMap<>();
    static Map<VillaFacility, Integer> villaFacilityIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    static {
        roomFacilityIntegerMap.put(new RoomFacility("1", "Furama", "30m", "20", "3 ngày", "Combofurama"), 1);
        roomFacilityIntegerMap.put(new RoomFacility("2", "FuramaVIP", "40m", "30", "3 ngày", "Combofurama"), 2);
        roomFacilityIntegerMap.put(new RoomFacility("3", "FuramaGold", "50m", "40", "3 ngày", "Combofurama"), 5);
        villaFacilityIntegerMap.put(new VillaFacility("1", "VillagSmall", "70m", "100", "1 tuần", "comboNomal", "25m", "3 tầng", "numbOfFloor"), 1);
        villaFacilityIntegerMap.put(new VillaFacility("2", "VillagGold", "70m", "100", "1 tuần", "comboGold", "25m", "3 tầng", "numbOfFloor"), 2);
        villaFacilityIntegerMap.put(new VillaFacility("3", "VillagRoyal", "70m", "100", "1 tuần", "comboRoyal", "25m", "3 tầng", "numbOfFloor"), 5);
    }

    @Override
    public void list() {
        System.out.println("Mời bạn chọn dịch vụ ");
        System.out.println("1.Room");
        System.out.println("2.Villa");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                System.out.println(roomFacilityIntegerMap.entrySet());
                roomFacilityIntegerMap=IORoomFacility.readRoomFacility();
                break;
            case 2:

                System.out.println(villaFacilityIntegerMap.entrySet());
                villaFacilityIntegerMap= IOVillaFacility.readRoomFacility();
                break;
        }
    }

    @Override
    public void add(Object object) {
        System.out.println("Mời bạn chọn dịch vụ ");
        System.out.println("1.Room");
        System.out.println("2.Villa");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                roomFacilityIntegerMap.put((RoomFacility) object, 1);
                IORoomFacility.writerRoomFacility(roomFacilityIntegerMap);
                break;

            case 2:
                villaFacilityIntegerMap.put((VillaFacility) object, 1);
                IOVillaFacility.writerVillaFacility(villaFacilityIntegerMap);
                break;
        }

    }

    @Override
    public void display() {
        System.out.println("Mời bạn chọn dịch vụ để bảo trì: ");
        System.out.println("1.Room");
        System.out.println("2.Villa");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                for (Map.Entry<RoomFacility, Integer> roomFacilityIntegerEntry:roomFacilityIntegerMap.entrySet()){
                    if (roomFacilityIntegerEntry.getValue()>=5){
                        System.out.println(roomFacilityIntegerEntry.getKey() + ":"+roomFacilityIntegerEntry.getValue());
                    }
                }
                    case 2:
                        for (Map.Entry<VillaFacility, Integer> villaFacilityIntegerEntry:villaFacilityIntegerMap.entrySet()){
                            if (villaFacilityIntegerEntry.getValue()>=5){
                                System.out.println(villaFacilityIntegerEntry.getKey()+":"+villaFacilityIntegerEntry.getValue());
                            }
                        }
                break;
        }
    }
}
