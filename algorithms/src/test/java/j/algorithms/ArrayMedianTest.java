package j.algorithms;

import static j.algorithms.ArrayMedian.findMedianSortedArrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
class ArrayMedianTest {
  public static Stream<Arguments> findMedianSortedArraysTest() {
    return Stream.of(
        Arguments.of(new int[]{1, 3}, new int[]{2}, 2.0),
        Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5),
        Arguments.of(new int[]{}, new int[]{1}, 1.0),
        Arguments.of(new int[]{2, 2, 4, 4}, new int[]{2, 2, 4, 4}, 3.00),
        Arguments.of(new int[]{1, 2}, new int[]{-1, 3}, 1.50000),
        Arguments.of(new int[]{1, 3}, new int[]{2, 7}, 2.50000)
    );
  }

  @ParameterizedTest
  @MethodSource
  void findMedianSortedArraysTest(int[] arr1, int[] arr2, double expected) {
    System.out.print("arr1 = " + Arrays.toString(arr1) + ", ");
    System.out.print("arr2 = " + Arrays.toString(arr2) + ", ");
    System.out.println("expected = " + expected);
    assertThat(findMedianSortedArrays(arr1, arr2)).isEqualTo(expected);
  }
}