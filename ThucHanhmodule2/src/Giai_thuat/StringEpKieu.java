package Giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class StringEpKieu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        string =string.toLowerCase();
        String[] string1=string.split(" ");
        String str = "";;
        for (int i = 0; i < string1.length; i++) {

        }
        for (int i = 0; i <string1.length ; i++) {
            string1[i]=string1[i].toUpperCase().charAt(0)+string1[i].substring(1,string1[i].length());
            str += string1[i]+" ";
        }

        System.out.println(str);
    }
}
