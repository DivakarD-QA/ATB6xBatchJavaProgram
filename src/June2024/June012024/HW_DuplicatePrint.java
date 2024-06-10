package June2024.June012024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW_DuplicatePrint {

    // how to print only duplicate element
    public static void main(String[] args) {

        int[] list = {1, 2, 2, 3, 4, 4, 5, 6};

            List<Integer> duplicates = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (Integer i : list) {
                if (set.contains(i)) {
                    duplicates.add(i);
                } else {
                    set.add(i);
                }
            }

        System.out.println("After removing duplicates - " + set);
        System.out.println( "Duplicate items - " + duplicates);


    }
}
