package j.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ArrayMedian.
 */
public final class ArrayMedian {
  private ArrayMedian() {
  }

  /**
   * findMedianSortedArrays, Given two sorted arrays nums1 abd nums2, returns
   * the median of the two sorted arrays.The overall run time complexity should
   * be O(log (m+n)).
   *
   * @param nums1 first array of ints
   * @param nums2 second array of ints
   *
   * @return median of the two arrays.
   */
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

    List<Integer> result = new ArrayList<>(nums1.length + nums2.length);

    final Integer[] boxedOne =
        Arrays.stream(nums1).boxed().toArray(Integer[]::new);
    final Integer[] boxedTwo =
        Arrays.stream(nums2).boxed().toArray(Integer[]::new);
    Collections.addAll(result, boxedOne);
    Collections.addAll(result, (boxedTwo));

    result.sort(null);
    int midPt = (result.size()) / 2;
    final boolean isOdd = result.size() % 2 == 1;
    return isOdd ? result.get(midPt)
        : (result.get(midPt - 1) + result.get(midPt)) / 2.0;

  }
}
