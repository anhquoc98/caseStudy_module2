package giai_thuat.ss2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 số");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập 2 số");
        int uocChung=0;
        int number1 = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <number&i<number1 ; i++) {
            if (number%i==0&number1%i==0){
                uocChung =i;
            }
        }
//        int maxnumber = 0;
        int minnumber = 0;
//        List <Integer> integerList=new ArrayList<>();
//        List <Integer> integerList1=new ArrayList<>();
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                integerList.add(i);
//            }
//        }
//        for (int i = 1; i <= number1; i++) {
//            if (number % i == 0) {
//                integerList1.add(i);
//            }
//        }
//        for (int i = 0; i <integerList.size() ; i++) {
//            for (int j = 0; j < integerList1.size(); j++) {
//                if (integerList.get(i) == integerList1.get(j)){
//                    if (maxnumber<integerList.get(i)){
//                        maxnumber=integerList.get(i);
//                    }
//                }
//            }
//        }
//        System.out.println(maxnumber);
       if (number<number1){
           minnumber =number1;
       }
       else {
           minnumber=number;
       }
       double avg=(minnumber+uocChung)/2;
        System.out.println(avg);
    }
}

