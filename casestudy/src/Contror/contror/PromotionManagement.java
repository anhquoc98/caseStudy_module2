package Contror.contror;

import java.util.Scanner;

public class PromotionManagement {
    public void promotionMethod() {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("1\tAdd new booking");
            System.out.println("2\tDisplay list booking");
            System.out.println("3\tReturn main menu");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {

                case 1:
                    break;
            }
        } while (menu == 3);

    }
}

