package giai_thuat.ss3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int []arr={1,2,2,3,4,5,2,6,7,8};
        int count=0;
        int index=0;
        boolean flag=true;
        for (int i = arr.length-1; i>=0; i--) {
            count++;
            if (arr[i]==number){
                flag=true;
                break;
            }
        }
        if(flag){
            index=arr.length-count;
            System.out.println(index);
        }
        else {
            System.out.println("Không tìm thấy phần tử");
        }
    }
}
