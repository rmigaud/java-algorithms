package j.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;

import static j.algorithms.LongestNonRepeatingSubstring.findLongestNonRepeatingSubstring;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LongestNonRepeatingSubstringTest {

  @ParameterizedTest
  @CsvFileSource(resources = "/findLongestSubstring-test-data.csv")
  void givenString_findLongestSubstring_withoutRepeatingCharacters(String s,
                                                                   String expected) {
    assertThat(findLongestNonRepeatingSubstring(s) + "").isEqualTo(expected);
  }

}
