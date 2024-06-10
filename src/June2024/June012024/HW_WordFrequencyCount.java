package June2024.June012024;

import java.util.HashMap;
import java.util.Map;

public class HW_WordFrequencyCount {
    public static void main(String[] args) {

//        Given a string, count the frequency of each word in the string.
//        Input: "hello world hello" Output: {hello=2, world=1}

        String str = "Hello World Hello";
        printFrequency(str);

    }

    public static void printFrequency(String str) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!word.isEmpty()) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    word = "";
                }
            } else {
                word += str.charAt(i);
            }
        }

        if (!word.isEmpty()) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


}
