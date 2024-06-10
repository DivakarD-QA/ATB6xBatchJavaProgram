package June2024.June012024;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab010_LinkedHashset {
    public static void main(String[] args) {
        Set course2 = new LinkedHashSet();
//        Will print the entered sequence
        //        Allow duplicate print once
        // Case-sensitive
        course2.add("ATB");
        course2.add("ATB");
        course2.add("MTB");
        course2.add("LAPIT");
        course2.add("SDET Blueprint");
        course2.add("Java for Testers");

        System.out.println(course2);



    }

}
