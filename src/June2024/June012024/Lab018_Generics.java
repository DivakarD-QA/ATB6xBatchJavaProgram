package June2024.June012024;

import java.util.ArrayList;
import java.util.List;

public class Lab018_Generics {
    public static void main(String[] args) {
        // Generics
        // Generics is a feature in Java that was introduced in Java 5.0.
        // It allows you to abstract over types.

        List id =  new ArrayList<>();
        id.add("Money");
        id.add("123");
        id.add(44560);
        id.add(true);

        System.out.println(id);


        printF("Money", "Makes Honey");
        printF("Beast", 123);
        printF(3,4);
        printF(true,false);
        printF(3.12,4.34);
    }

//    private static void printF(String i, String j) {
//        System.out.println("String ------- ");
//        System.out.println(i);
//        System.out.println(j);
//
//    }
//    private static void printF(String i, Integer j) {
//        System.out.println("String & Integer ------- ");
//        System.out.println(i);
//        System.out.println(j);
//
//    }
//    private static void printF(Integer i, Integer j) {
//        System.out.println("Integer & Integer ------- ");
//        System.out.println(i);
//        System.out.println(j);
//
//    }
//
//    private static void printF(Boolean i, Boolean j) {
//        System.out.println("Boolean & Boolean ------- ");
//        System.out.println(i);
//        System.out.println(j);
//
//    }
//
//    private static void printF(Double i, Double j) {
//        System.out.println("Double & Double ------- ");
//        System.out.println(i);
//        System.out.println(j);
//
//    }


//    Instead of using separate method for each data type, we can use generics


    private static <T> void printF(T i, T j) {
        System.out.println(" T ------- ");
        System.out.println(i);
        System.out.println(j);

    }


}
