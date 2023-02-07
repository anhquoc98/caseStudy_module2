package giai_thuat.ss11;

import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào 1 số :");
        int number =Integer.parseInt(scanner.nextLine());
        Queue<Integer>integerQueue=new LinkedList<>();
        List<Integer> integerList=new ArrayList<>();
        int n=1;
        int count;
        while (n <= number){
            count =0;
            for (int i = 1; i <=n ; i++) {
                if (n%i ==0){
                    count++;
                }
            }
            if (count==2){
                integerList.add(n);
                integerQueue.add(n);
            }
            n++;
        }
        for (Integer i:integerQueue){
            System.out.print(i);// cách 1
        }
        System.out.println("");
        System.out.println("");
        for (Integer i:integerList){
            System.out.println(i);// cách 2
        }
    }
}
