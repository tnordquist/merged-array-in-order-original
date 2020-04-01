package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class IsInOrderTest {


  private static Object[][] isInOrder() {
    return new Object[][]{

        {new int[]{1, 4, 5}, new int[]{2, 3, 6}, new int[]{1, 2, 3, 4, 5, 6}},
        {new int[]{}, new int[]{2, 3, 6}, new int[]{2, 3, 6}},
        {new int[]{}, new int[]{}, new int[]{}}
    };
  }

  private static Object[][] isNotInOrder() {
    return new Object[][]{

        {new int[]{1, 5}, new int[]{2, 3, 6}, new int[]{1, 2, 6, 3, 5}},
        {new int[]{1, 5}, new int[]{2, 3, 6}, new int[]{1, 6, 3, 5}},
        {new int[]{1, 5}, new int[]{2, 3, 6}, new int[]{1, 2, 3, 5, 6, 8}},
        {new int[]{1, 9}, new int[]{7, 8}, new int[]{1, 7, 8}},
        {new int[]{55, 9}, new int[]{7, 8}, new int[]{1, 7, 8, 9}}
    };
  }

  private static Object[][] mergedIsInOrderException() {
    return new Object[][]{
        {new int[]{1, 2, 4}, new int[]{2, 3, 5}, new int[]{1, 2, 2, 4, 3, 5}},
        {new int[]{1, 2, 4}, new int[]{1, 2, 4}, new int[]{1, 1, 4, 4, 2, 2}},
        {new int[]{1, 5}, new int[]{2, 3, 5}, new int[]{1, 2, 3, 5, 5}},
        {new int[]{1, 2, 5}, new int[]{2, 3, 6}, new int[]{1, 2, 3, 5, 6}}
    };
  }


  @ParameterizedTest(name = "[{index}] source1={0}, source2={1}, combined={2}")
  @MethodSource("isInOrder")
  void isInOrder(int[] arr1, int[] arr2, int[] combinedArr) {

    assertTrue(MergedInOrder.mergedIsInOrder(arr1, arr2, combinedArr));
  }

  @ParameterizedTest(name = "[{index}] source1={0}, source2={1}, combined={2}")
  @MethodSource("isNotInOrder")
  void isNotInOrder(int[] arr1, int[] arr2, int[] combinedArr) {

    assertFalse(MergedInOrder.mergedIsInOrder(arr1, arr2, combinedArr));
  }

  @ParameterizedTest(name = "[{index}] source1={0}, source2={1}, combined={2}, expected IllegalArgumentException")
  @MethodSource("mergedIsInOrderException")
  void mergedIsInOrderException(int[] arr1, int[] arr2, int[] combinedArr) {
    assertThrows(IllegalArgumentException.class,
        () -> MergedInOrder.mergedIsInOrder(arr1, arr2, combinedArr));
  }
}
