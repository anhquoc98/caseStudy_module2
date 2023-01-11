package Giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTimKiem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string =scanner.nextLine();
        String[] strings=string.split("");
        List <String> stringList =new ArrayList<>();
        List <String> stringList1 =new ArrayList<>();
        for (int i = 0; i <strings.length ; i++) {
            stringList.add(strings[i]);
            System.out.println(stringList.get(i));
            if (!stringList.contains(stringList.get(i))){
                stringList1.add(stringList.get(i));
            }
            System.out.print(stringList1.get(i));
        }
    }
}
