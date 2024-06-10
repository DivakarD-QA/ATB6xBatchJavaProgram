package June2024.June012024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab012_AllSet {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(123456);
        integerSet.add(12345);
        integerSet.add(1234);
        integerSet.add(123);
        integerSet.add(12);
        integerSet.add(null);
        System.out.println(integerSet);


        Set<Integer> integerSet2 = new LinkedHashSet<>();
        integerSet2.add(123456);
        integerSet2.add(12345);
        integerSet2.add(1234);
        integerSet2.add(12);
        integerSet2.add(123);
        integerSet2.add(null);
        System.out.println(integerSet2);


        Set integerSet3 = new TreeSet<>();
//        integerSet3.add(123456);
//        integerSet3.add(12345);
//        integerSet3.add(1234);
//        integerSet3.add(12);
//        integerSet3.add(123);
//        integerSet3.add(null);

        integerSet3.add("Pramod");
        integerSet3.add("Dutta");
        integerSet3.add("Autta");

//        integerSet3.add(null);
        System.out.println(integerSet3);
    }
}
