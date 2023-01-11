package Bai2;

import java.util.Scanner;

public class DateUtil {
    public static final String REGEX_CODE="^([0-2]{1}[0-9]{1}|30|31)(/)([0-1]{1}[0-9]{1})(/)([0-9]{4))$";

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String date =scanner.nextLine();
        System.out.println(date.matches(REGEX_CODE));

    }
}

