package edu.cnm.deepdive;

public class MergedInOrder {

  public static boolean mergedIsInOrder(int[] arr1, int[] arr2, int[] mergedArr) {

    int ct1 = 0;
    int ct2 = 0;
    boolean isFair = true;

    if(mergedArr.length != arr1.length + arr2.length){
      return false;
    }

    for(int i = 0; i < mergedArr.length; ++i) {
      if(ct1 < arr1.length && mergedArr[i] == arr1[ct1]) {
        ct1++;
      } else if (ct2 < arr2.length && mergedArr[i] == arr2[ct2]) {
        ct2++;
      } else {
        isFair = false;
      }
    }
    return isFair;
  }

}
