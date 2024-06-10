package June2024.June012024;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab017_HashTable {
    public static void main(String[] args) {
//        Hashtable is also same as the MAP -- print needs enumeration
//        Vector, HashTable is only thread safe

        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("ID", 1);
        table.put("ID2", 31);
        table.put("ID3", 43);

        Enumeration<String> e  = table.keys();
        while(e.hasMoreElements()){
            String key = e.nextElement();
            System.out.println(key + " : " + table.get(key));
        }

    }
}
