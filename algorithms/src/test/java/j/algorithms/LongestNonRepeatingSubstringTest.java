package j.algorithms;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import org.springframework.boot.test.context.*;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class LongestNonRepeatingSubstringTest {
  
  @ParameterizedTest
  @CsvFileSource(resources = "/findLongestSubstring-test-data.csv")
  void givenString_findLongestSubstring_withoutRepeatingCharacters(String s,
                                                                   String expected) {
    assertThat(LongestNonRepeatingSubstring.findLongestNonRepeatingSubstring(s) + "").isEqualTo(expected);
  }
  
}
