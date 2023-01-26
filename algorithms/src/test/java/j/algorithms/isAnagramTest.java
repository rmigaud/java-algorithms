package j.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {

    @Test
    void isAnagram() {
        assertTrue(Anagram.isAnagram("abba", "baba"));
        assertFalse(Anagram.isAnagram("abba", "Babbage"));
        assertFalse(Anagram.isAnagram("Babbage", "abba"));
    }

    @Test
    @DisplayName("hello and olleh are known anagrams.")
    void helloAndOlleh_areAnagrams_true() {
        assertTrue(Anagram.isAnagram("hello", "olleh"));
    }

    @Test
    @DisplayName("12321 and 32211 are known anagrams.")
    void assure12321_and_32211_areAnagrams_true() {
        assertTrue(Anagram.isAnagram("12321", "32211"));
    }
}