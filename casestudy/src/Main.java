import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arg1 = scanner.nextLine();
        ArrayList<Object> arrayList = new ArrayList<>();
        String[] ar = arg1.split("");
        boolean flag =true;
        int count =0;
        char[] arg3 = arg1.toCharArray();
        char[] arg2 =new char[arg3.length];
        for (int i = 0; i <arg3.length ; i++) {
            for (int j = 0; j < arg3.length-1; j++) {
                if (arg3[i]==arg3[j]){
                    flag =true;
                }
            }
            if (flag){
                arg2[i]=arg3[i];
                System.out.println(Arrays.toString(arg2));
            }
        }
//        System.out.println(Arrays.toString(arg2));
//        for (int i = 0; i < ar.length; i++) {
//            if (arrayList.indexOf(ar[i])!=-1) {
//                arrayList.add(arg3[i]);
//            }
//            System.out.println(arrayList.get(i));
//        }
    }


//        for (int i = 0; i <arg2.length ; i++) {
//            arg3[i] =arg1.toCharArray()[i];
//        }

//        System.out.println(Arrays.toString(arg2));
//        ArrayList<Character> list =new ArrayList<>();
//        for (int i = 0; i <arg2.length ; i++) {
//            if (list.indexOf(arg2)==-1){
//                list.add((char) i);
//                System.out.println(Arrays.toString(list.toArray()));
//            }
//        }
//        char []arg3 =new char[list.size()];
//        for (int i = 0; i <list.size() ; i++) {
//            arg3[i]=list.get(i);
//        }
//        System.out.println(Arrays.toString(arg3));

}