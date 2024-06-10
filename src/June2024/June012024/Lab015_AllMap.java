package June2024.June012024;

import java.util.*;

public class Lab015_AllMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new WeakHashMap();
//        Will remove the unused key, optimized
//        No sequence
//        {id3=34, id2=2, id=11}

//         Map<String,Integer> map = new TreeMap<>();
//         Print in defined sequence
//        {id=11, id2=2, id3=34}


//         Map<String,Integer> map = new LinkedHashMap<>();
        //         Print in insertion order
//        {id=11, id2=2, id3=34}


//        Map<String,Integer> map = new HashMap<>();
        //        No sequence
//        {id2=2, id3=34, id=11}
        map.put("id",1);
        map.put("id3",34);
        map.put("id",11);
        map.put("id2",2);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(2));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));
        System.out.println(map.get("id3"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
