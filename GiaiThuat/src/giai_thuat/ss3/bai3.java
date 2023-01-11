package giai_thuat.ss3;

public class bai3 {
    public static void main(String[] args) {
        double sum =0;
        int[][] array = {
                {1, 2, 4, 5, 6},{5,6,7,8,9}
        };
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2==0){
                    sum+=array[i][j];
                    count++;
                }
            }
        }
        System.out.println("chung bình cộng mảng 2 chiều:"+sum/count);
    }
}
