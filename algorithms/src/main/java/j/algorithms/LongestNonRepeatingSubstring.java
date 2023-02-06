package j.algorithms;

import java.util.HashSet;

/**
 Non-Repeating Substrings do not have repeating characters.
 */
public class LongestNonRepeatingSubstring {
  private LongestNonRepeatingSubstring() {
  }

  /**
   Find the Longest Non-Repeating Substring of any String.
   */
  static int findLongestNonRepeatingSubstring(final String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }

    HashSet<String> set = new HashSet<>();
    final String[] input = s.split("");
    int max = 0;

    if (input.length < 2) {
      return input.length;
    }

    for (int j = 0; j < input.length; j++) {
      for (int i = j; i < input.length; i++) {
        if (!set.add(input[i])) {
          if (set.size() > max) {
            max = set.size();
          }
          set = new HashSet<>();
          break;
        }
      }
      if (set.size() > max) {
        max = set.size();
      }
    }
    return max;
  }
}
