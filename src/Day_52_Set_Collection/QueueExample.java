package Day_52_Set_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {


        Queue<Integer> queue=new PriorityQueue<>();        // ilk giren ilk cıkar... queue sınıfı... fifo
        queue.add(5);                                      // kuyruk yapısına ekleme silme işlemlerini kolaylastırır.
        queue.add(8);                                      // collection interface bütün metotlarını kullanır.
        queue.add(12);
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);


        //SET yinelen verileri kabul etmez.
    }
}
