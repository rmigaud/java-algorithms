package j.algorithms;

import java.util.HashMap;

public class Anagram {

    static boolean isAnagram(String firstStr, String secondStr) {
        if (firstStr.length() != secondStr.length()) return false;

        HashMap<String, Integer> frequencyOf = new HashMap<>();

        for (String letter : firstStr.split("")) {
            if (frequencyOf.containsKey(letter)) {
                frequencyOf.put(letter, frequencyOf.get(letter) + 1);
            } else {
                frequencyOf.put(letter, 1);
            }
        }
        for (String letter : secondStr.split("")) {
            if (frequencyOf.containsKey(letter)) {
                frequencyOf.put(letter, frequencyOf.get(letter) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

}
