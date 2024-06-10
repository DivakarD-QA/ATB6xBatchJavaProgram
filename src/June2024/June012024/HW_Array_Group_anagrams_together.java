package June2024.June012024;

import java.util.*;

public class HW_Array_Group_anagrams_together {
    public static void main(String[] args) {


//    Given an array of strings, group the anagrams together.
//    Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//    Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(words);


    }

    private static void groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        for (List<String> anagramGroup : anagramMap.values()) {
            System.out.println(anagramGroup);
        }
    }
}
