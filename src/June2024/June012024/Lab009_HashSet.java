package June2024.June012024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab009_HashSet {
    public static void main(String[] args) {

        Set course = new HashSet();  // no data type defined
        course.add("ATB");
        course.add("ATB");
        course.add("MTB");
        course.add("LAPIT");
        course.add("SDET Blueprint");
        course.add("Java for Testers");
        course.add(123);

        System.out.println(course);

        System.out.println("------");

        Set<String> course1 = new HashSet<>();  // no data type defined
        course1.add("ATB");
        course1.add("MTB");
        course1.add("LAPIT");
        course1.add("SDET Blueprint");
        course1.add("Java for Testers");
//        course1.add(123);

        System.out.println(course1);
        System.out.println("------");

for (String c : course1){
    System.out.println( c );
}

//both are same
        for (Object c : course1){
            System.out.println( c );
        }

        System.out.println("------ Iterator ");
        Iterator co = course1.iterator();
        while (co.hasNext()){
            System.out.println(co.next());
        }
    }


}
