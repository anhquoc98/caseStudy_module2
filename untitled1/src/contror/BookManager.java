package contror;

import modol.BookService.ServiceBook;

import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        ServiceBook serviceBook=new ServiceBook();
        Scanner scanner =new Scanner(System.in);
        int menu =0;
        do {
            System.out.println("Quản lý sách");
            System.out.println("1. hiển thị");
            menu =Integer.parseInt(scanner.nextLine());
            switch (menu){
                case 1:
                    serviceBook.list();
            }
        }while (menu<5);
    }
}
