package edu.cnm.deepdive;

/**
 * This class defines a single static method, {@link #mergedIsInOrder(int[], int[], int[])}, which evaluates
 * specified int array values to determine whether the merged array maintains the ascending order of the two other arrays .
 */
public class MergedInOrder {

  private MergedInOrder() {
    // NOTE: There is NO need to do anything with this constructor! The method
    //       you will implement in this class is static; thus, there is no need
    //       to create instances of this class.
  }

  /**
   * Computes and returns a <code>boolean</code> flag indicating whether the provided
   *    * <code>mergedArr</code> maintains the order arr1 and arr2.
   *
   * @param arr1 an ordered array
   * @param arr2 an ordered array
   * @param mergedArr the array which merges arr1 and arr2 and is to be tested for maintaining the order of arr1 and arr2
   * @return flag indicating whether <code>mergedArr</code> maintains the ascending order of arr1 and arr2.
   */
  public static boolean mergedIsInOrder(int[] arr1, int[] arr2, int[] mergedArr) {

    int ct1 = 0;
    int ct2 = 0;
    boolean inOrder = true;

    if(mergedArr.length != arr1.length + arr2.length){
      return false;
    }

    for(int i = 0; i < mergedArr.length; ++i) {
      if(ct1 < arr1.length && mergedArr[i] == arr1[ct1]) {
        ct1++;
      } else if (ct2 < arr2.length && mergedArr[i] == arr2[ct2]) {
        ct2++;
      } else {
        inOrder = false;
      }
    }
    return inOrder;
  }

}
