package June2024.June012024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab016_MultipleMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("firstName", "pramod");
        map.put("lastName", "pawar");
        map.put("email", "dasda@addad.omc");
        map.put("phone", "1234567890");
        map.put("city", "Pune");
        map.put("state", "MH");
        map.put("country", "India");
        map.put("zip", "411057");
        System.out.println("Student 1 - " + map);

        Map<String, String> map2 = new HashMap();
        map2.put("firstName", "Amit");
        map2.put("lastName", "pawar");
        map2.put("email", "dasda@addad.omc");
        map2.put("phone", "1234567890");
        map2.put("city", "Pune");
        map2.put("state", "MH");
        map2.put("country", "India");
        map2.put("zip", "411057");
        System.out.println("Student 2 - " +map2);

        ArrayList list = new ArrayList();
        list.add(map);
        list.add(map2);
        System.out.println("List = "+ list);
        System.out.println("List 1st value = " + list.get(0));
        System.out.println("List 2nd value = " + list.get(1));
    }
}
