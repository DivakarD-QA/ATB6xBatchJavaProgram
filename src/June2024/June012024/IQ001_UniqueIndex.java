package June2024.June012024;

import java.util.HashSet;
import java.util.Set;

public class IQ001_UniqueIndex {
    public static void main(String[] args) {
        // Given an array of integers, return an array of the unique elements.
        // Input: [1, 2, 2, 3, 4, 4, 5]
        // Output: [1, 2, 3, 4, 5]

        int[] input = {1, 2, 2, 3, 4, 3, 5, 8, 5};

        Set<Integer> unique = new HashSet<>();
        for (int u : input){
            unique.add(u);
        }
        System.out.println(unique);

    }
}
