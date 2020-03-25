package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class IsInOrderTest {


  private static Object[][] isInOrder() {
    return new Object[][]{

        {new int[]{1, 4, 5}, new int[]{2, 3, 6}, new int[]{1, 2, 3, 4, 5, 6}},
        {new int[]{}, new int[]{2, 3, 6}, new int[]{2, 3, 6}}
    };
  }

  private static Object[][] isNotInOrder() {
    return new Object[][]{

        {new int[]{1, 5}, new int[]{2, 3, 6}, new int[]{1, 2, 6, 3, 5}},
        {new int[]{1, 5}, new int[]{2, 3, 6}, new int[]{1, 6, 3, 5}},
        {new int[]{1, 5}, new int[]{2, 3, 6}, new int[]{1, 2, 3, 5, 6, 8}},
        {new int[]{1, 9}, new int[]{1, 7, 8}, new int[]{7, 8}},
        {new int[]{55, 9}, new int[]{7, 8}, new int[]{1, 7, 8, 9}}
    };
  }

  @ParameterizedTest(name = "[{index}] source1={0}, source2={1}, combined={2}")
  @MethodSource
  void isInOrder(int[] arr1, int[] arr2, int[] combinedArr) {

    assertTrue(MergedInOrder.mergedIsInOrder(arr1, arr2, combinedArr));
  }

  @ParameterizedTest(name = "[{index}] source1={0}, source2={1}, combined={2}")
  @MethodSource("isNotInOrder")
  void isNotInOrder(int[] arr1, int[] arr2, int[] combinedArr) {

    assertFalse(MergedInOrder.mergedIsInOrder(arr1, arr2, combinedArr));
  }
}
