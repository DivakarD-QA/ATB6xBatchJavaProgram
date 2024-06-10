package June2024.June012024;

import java.util.HashSet;
import java.util.Set;

public class Lab008_HashSet {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet();
        //        Will print in the no sequence
        //        Allow duplicate print once
        // Case-sensitive
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("WaterMelon");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("MangO");
//        fruits.add(123);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println("Is Empty : " +fruits.isEmpty());
        System.out.println(fruits.contains("Orange"));
        fruits.remove("MangO");
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.clear();
        System.out.println(fruits);

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("WaterMelon");
        System.out.println(fruits);

    }
}
