package giai_thuat.ss17;

import java.util.Scanner;

public class Regex {
    public static final String REGEX_EMAIL = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String email;
        do {
            System.out.println("Nhập Email");
            email=scanner.nextLine();
            if (email.matches(REGEX_EMAIL)){
                System.out.println("email hợp lệ");
            }
            else {
                System.out.println("email không hợp lệ");
            }
        }while (!email.matches(REGEX_EMAIL));

    }
}
