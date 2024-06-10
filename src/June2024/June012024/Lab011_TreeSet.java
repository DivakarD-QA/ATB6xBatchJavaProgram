package June2024.June012024;

import java.util.Set;
import java.util.TreeSet;

public class Lab011_TreeSet {
    public static void main(String[] args) {

        Set course3 = new TreeSet();
        //        Will print in the defined sequence
        //        Allow duplicate print once
        // Case-sensitive
        // Don't allow different data type

        course3.add("MTB");
        course3.add("LAPIT");
        course3.add("ATB");
        course3.add("ATB");
        course3.add("atB");
        course3.add("SDET Blueprint");
        course3.add("Java for Testers");
//        course3.add(10);
//        course3.add(20);
//        course3.add(12);
//        course3.add(20);

//        Exception in thread "main" java.lang.ClassCastException: if we added different data type

        System.out.println(course3);


    }
}
