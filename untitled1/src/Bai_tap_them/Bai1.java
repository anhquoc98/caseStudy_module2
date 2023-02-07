package Bai_tap_them;

import java.util.LinkedList;
import java.util.Queue;

public class Bai1 {
    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        for (Integer q:queue){
            System.out.println(q);
        }
        System.out.println(queue.peek());
    }
}
