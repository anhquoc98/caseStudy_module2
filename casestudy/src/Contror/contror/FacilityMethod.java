package Contror.contror;

import Model.Ser.FacilitySer.FacilitySer;
import Model.model.Facility.RoomFacility;
import Model.model.Facility.VillaFacility;

import java.util.Scanner;

public class FacilityMethod {

    public void facilityMethod(){
        Scanner scanner=new Scanner(System.in);
        FacilitySer facilitySer =new FacilitySer();
        StringFacility regexCode = new StringFacility();
        int menu = 0;
        do {
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tEdit facility maintenance");
            System.out.println("4\tReturn main menu");
            try{
                menu = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException n){
                n.printStackTrace();
            }

            switch (menu) {
                case 1:
                    facilitySer.list();
                    break;
                case 2:
                    System.out.println("1.room /t 2.villa");
                    int choiceAddFacility;
                    do {
                        System.out.println(
                                "Your choice \n" +
                                        "1. Add Room \n" +
                                        "2. Add Villa \n" +
                                        "3. Return facility menu");
                        switch (choiceAddFacility = Integer.parseInt(scanner.nextLine())) {
                            case 1:
                                /**
                                 * TÊN DỊCH VỤ
                                 */
                                String serviceName;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Tên dịch vụ phải viết hoa ký tự đầu,\n" +
                                                    "các ký tự sau là ký tự bình thường");
                                    System.out.println("Nhập tên phòng");
                                    serviceName = scanner.nextLine();
                                    if (!serviceName.matches(regexCode.getSERVICE_NAME_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại");
                                    }
                                } while (!serviceName.matches(regexCode.getSERVICE_NAME_REGEX()));
                                /**
                                 * DIỆN TÍCH PHÒNG
                                 */
                                String usableArea;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Diện tích sử dụng phải là số thực lớn hơn 30m2");
                                    System.out.println("Nhập diện tích phòng");
                                    usableArea = scanner.nextLine();
                                    if (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX()));
                                /**
                                 * CHI PHÍ THUÊ
                                 */
                                String rentalCost;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Chi phí thuê phải là số dương");
                                    System.out.println("Nhập chi phí thuê");
                                    rentalCost = scanner.nextLine();
                                    if (!rentalCost.matches(regexCode.getRENTAL_COSTS_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!rentalCost.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                /**
                                 * SỐ NGƯỜI TỐI ĐA
                                 */
                                String maxiumNumbOfPeople;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Số lượng người tối đa phải >0 và nhỏ hơn <20");
                                    System.out.println("Nhập số người tối đa");
                                    maxiumNumbOfPeople = scanner.nextLine();
                                    if (!maxiumNumbOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!maxiumNumbOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                /**
                                 * KIỂU THUÊ
                                 */
                                String rentalType;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Tên kiểu thuê phải viết hoa ký tự đầu,\n" +
                                                    "các ký tự sau là ký tự bình thường");
                                    System.out.println("Kiểu thuê");
                                    rentalType = scanner.nextLine();
                                    if (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX()));
                                /**
                                 * MÃ DỊCH VỤ
                                 */
                                String serviceCode;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "-Mã dịch vụ phải đúng định dạng: SVXX-YYYY, \n " +
                                                    "với YYYY là các số từ 0-9, XX là: \n" +
                                                    "-Nếu là Villa thì XX sẽ là VL.\n" +
                                                    "-Nếu Room thì XX sẽ là RO.");
                                    System.out.println("Nhập mã phòng");
                                    serviceCode = scanner.nextLine();
                                    if (!serviceCode.matches(regexCode.getROOM_CODE_REGEX())) {
                                        System.out.println("Nhập chưa đúng format room vui lòng nhập lại.");
                                    }
                                } while (!serviceCode.matches(regexCode.getROOM_CODE_REGEX()));
                                System.out.println("Nhập dịch vụ cung cấp miễn phí");
                                String freeServiceIncluded = scanner.nextLine();
                                RoomFacility room = new RoomFacility(serviceName, usableArea, maxiumNumbOfPeople, rentalType,
                                        serviceCode, freeServiceIncluded);
                                facilitySer.add(room);
                                break;
                            case 2:
                                /**
                                 * VILLA
                                 * TÊN DỊCH VỤ
                                 */
                                String serviceNameVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Tên dịch vụ phải viết hoa ký tự đầu,\n" +
                                                    "các ký tự sau là ký tự bình thường");
                                    System.out.println("Nhập tên phòng");
                                    serviceNameVilla = scanner.nextLine();
                                    if (!serviceNameVilla.matches(regexCode.getSERVICE_NAME_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!serviceNameVilla.matches(regexCode.getSERVICE_NAME_REGEX()));
                                /**
                                 * DIỆN TÍCH PHÒNG
                                 */
                                String usableAreaVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Diện tích sử dụng phải là số thực lớn hơn 30m2");
                                    System.out.println("Nhập diện tích phòng");
                                    usableAreaVilla = scanner.nextLine();
                                    if (!usableAreaVilla.matches(regexCode.getUSABLE_AREA_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!usableAreaVilla.matches(regexCode.getUSABLE_AREA_REGEX()));
                                /**
                                 * CHI PHÍ THUÊ
                                 */
                                String rentalCostVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Chi phí thuê phải là số dương");
                                    System.out.println("Nhập chi phí thuê");
                                    rentalCostVilla = scanner.nextLine();
                                    if (!rentalCostVilla.matches(regexCode.getRENTAL_COSTS_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!rentalCostVilla.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                /**
                                 * SỐ NGƯỜI TỐI ĐA
                                 */
                                String maxiumNumbOfPeopleVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Số lượng người tối đa phải >0 và nhỏ hơn <20");
                                    System.out.println("Nhập số người tối đa");
                                    maxiumNumbOfPeopleVilla = scanner.nextLine();
                                    if (!maxiumNumbOfPeopleVilla.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!maxiumNumbOfPeopleVilla.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                /**
                                 * KIỂU THUÊ
                                 */
                                String rentalTypeVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Kiểu thuê phải viết hoa ký tự đầu,\n" +
                                                    "các ký tự sau là ký tự bình thường");
                                    System.out.println("Kiểu thuê");
                                    rentalTypeVilla = scanner.nextLine();
                                    if (!rentalTypeVilla.matches(regexCode.getRENTAL_TYPE_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!rentalTypeVilla.matches(regexCode.getRENTAL_TYPE_REGEX()));
                                /**
                                 * MÃ DỊCH VỤ
                                 */
                                String serviceCodeVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "-Mã dịch vụ phải đúng định dạng: SVXX-YYYY, \n " +
                                                    "với YYYY là các số từ 0-9, XX là: \n" +
                                                    "-Nếu là Villa thì XX sẽ là VL.\n" +
                                                    "-Nếu Room thì XX sẽ là RO.");
                                    System.out.println("Nhập mã phòng");
                                    serviceCodeVilla = scanner.nextLine();
                                    if (!serviceCodeVilla.matches(regexCode.getVILLA_CODE_REGEX())) {
                                        System.out.println("Nhập chưa đúng format villa vui lòng nhập lại.");
                                    }
                                } while (!serviceCodeVilla.matches(regexCode.getVILLA_CODE_REGEX()));

                                /**
                                 * TIÊU CHUẨN PHÒNG
                                 */
                                String roomStandard;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Tiêu chuẩn phòng phải viết hoa ký tự đầu,\n" +
                                                    "các ký tự sau là ký tự bình thường");
                                    System.out.println("Nhập tiêu chuẩn phòng");
                                    roomStandard = scanner.nextLine();
                                    if (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX()));
                                /**
                                 * DIỆN TÍCH HỒ BƠI
                                 */
                                String poolArea;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Diện tích sử dụng phải là số thực lớn hơn 30m2");
                                    System.out.println("Nhập diện tích hồ bơi");
                                    poolArea = scanner.nextLine();
                                    if (!poolArea.matches(regexCode.getPOOL_AREA_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!poolArea.matches(regexCode.getPOOL_AREA_REGEX()));
                                /**
                                 * SỐ TẦNG
                                 */
                                String numbOfFloor;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Số tầng phải là số nguyên dương.");
                                    System.out.println("Nhập số tầng");
                                    numbOfFloor = scanner.nextLine();
                                    if (!numbOfFloor.matches(regexCode.getFLOOR_NUMBER_REGEX())) {
                                        System.out.println("Nhập chưa đúng format vui lòng nhập lại.");
                                    }
                                } while (!numbOfFloor.matches(regexCode.getFLOOR_NUMBER_REGEX()));
                                VillaFacility villa = new VillaFacility(serviceNameVilla,usableAreaVilla,rentalCostVilla,maxiumNumbOfPeopleVilla,rentalTypeVilla,serviceCodeVilla,roomStandard,
                                        poolArea,numbOfFloor);
                                facilitySer.add(villa);
                                break;
                        }
                    } while (choiceAddFacility != 3);
                    break;
                case 3:
                    facilitySer.display();
            }
        } while (menu < 4);

    }
}
