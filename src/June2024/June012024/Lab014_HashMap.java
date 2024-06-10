package June2024.June012024;

import java.util.HashMap;
import java.util.Map;

public class Lab014_HashMap {
    public static void main(String[] args) {

        // Map - key value pair
        // API Testing - JSON - JavaScript Object Notation - Map
        // JSON - key value pair
        // HashSet and HastMap
        // name - pramod, age - 65, roll - 1, course -atb
        //        IF duplicate key will replace the latest key
        // put is for add
//        Case sensitive

        Map< String, Object> student = new HashMap<>();
        student.put("FirstName", "Jeni");
        student.put("FirstName", "Jenifer");

        student.put("Age", 24);
        student.put("Roll", 16);
        student.put("LastName", "Diva");
        student.put("Course", "ATB");
        System.out.println(student);
        System.out.println(student.get("FirstName"));
        System.out.println(student.get("Roll"));
        System.out.println(student.containsKey("Age"));
        System.out.println(student.isEmpty());
        System.out.println("------");
        System.out.println(student.containsValue(24));
        System.out.println(student.keySet());
        System.out.println(student.values());


        for(Map.Entry<String,Object> item: student.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
