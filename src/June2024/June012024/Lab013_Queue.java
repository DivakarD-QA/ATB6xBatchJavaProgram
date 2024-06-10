package June2024.June012024;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab013_Queue {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
//        Can have duplicate, duplicate will also be printed
//        Maintain the default sorting
//        Case sensitive
//        Can have offer keywork for add
//        Can have poll  - will remove the first values in array and print
//        Can have  peek - will not remove the first value in array but only print
//        No null values accepted

        q.add("Apple");
        q.add("Banana");
        q.offer("Watermelon");
        q.add("Carrot");
        q.add("Ba");
        q.add("CArroT");
//        q.offer(null);


        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);

    }
}
