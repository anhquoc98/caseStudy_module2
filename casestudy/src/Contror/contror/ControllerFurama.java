package Contror.contror;

import java.util.Scanner;

public class ControllerFurama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("1.\tEmployee.csv Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management ");
            System.out.println("5.\tPromotion Management ");
            System.out.println("6.\tExit ");
            try{
                select = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                 e.printStackTrace();
            }

            switch (select) {
                case 1:
                    ImployeeMethod imployeeMethod = new ImployeeMethod();
                    imployeeMethod.imloyeeMethod();
                    break;
                case 2:
                    CustomerMethod customerMethod = new CustomerMethod();
                    customerMethod.customerMethod();
                    break;
                case 3:
                    FacilityMethod facilityMethod = new FacilityMethod();
                    facilityMethod.facilityMethod();
                    break;
                case 4:
                    BookingMethod bookingMethod = new BookingMethod();
                    bookingMethod.bookingMethod();
                    break;
                case 5:
                    PromotionManagement promotionManagement = new PromotionManagement();
                    promotionManagement.promotionMethod();
                    break;

            }
        } while (select < 6);
    }
}
