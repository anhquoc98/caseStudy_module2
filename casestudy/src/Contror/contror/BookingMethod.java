package Contror.contror;

import java.util.Scanner;

public class BookingMethod {
    public void bookingMethod(){
        Scanner scanner=new Scanner(System.in);
        int menu;
        do {
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tEdit facility maintenance");
            System.out.println("4\tReturn main menu");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {

                case 1:
                    break;
            }
        } while (menu == 4);

    }
}
