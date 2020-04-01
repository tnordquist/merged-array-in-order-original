## Value

* Basic implementation: 5 points
* Basic unit tests: 5 points
* Extra credit implementation: 5 points
* Extra credit unit tests: 5 points

## Basic task

Two int arrays will be provided, both of which is sorted numerically in ascending order. There is no overlap in values between the two arrays. Your task is to return true if the first two arrays have been merged into the third array so that the order of numbers in the first two arrays has been maintained in the third array.

As an example,

``Array 1: [1, 3, 5]
  Array 2: [2, 4, 6]
  Merged Array: [1, 2, 4, 6, 5, 3] ``
  
  would return false, since 3 came before 5 in Array 1, but 5 appeared first in the merged array.
  
But,
  
``Array 1: [1, 3, 5]
Array 2: [2, 4, 6]
Merged Array: [1, 2, 3, 5, 4, 6]``
  
would return true. 

### Implementation

In the `edu.cnm.deepdive.MergedInOrder` class, the `nextPerfectSquare` method is declared with the following signature, return type, and modifiers:

```java
public static boolean mergedIsInOrder(int[] arr1, int[] arr2, int[] mergedArr)
```
For more method declaration details, see the [Javadoc documentation](api/edu/cnm/deepdive/MergedInOrder.html#mergedIsInOrder(int[], int[], int[])).

For the basic task, complete the implementation of this method, according to the following specifications:

* If the array passed in `mergedArr` maintains the order of the arrays passed in `arr1` and `arr2`, then mergedIsInOrder(arr1, arr2, mergedArr) must return `true`; if `mergedArr` does not maintain the order of `arr1` and `arr2`, it must return `false`. 


## Extra credit

The values in the arrays of the basic implementation contained no overlapping values. In this case, if there is any overlap between the values in `arr1` and those in `arr2`, the implementation must throw an `IllegalArgumentException`.

The required changes are to be applied to the same method used for the basic implementation.

For example,

If `arr1` is `{1, 2, 4}` and `arr2` is `{2, 3, 5}`, two is a value that overlaps `arr1` and `arr2`: in this case the implemenatation must throw an `IllegalArgumentException`. 

### Unit tests

For unit testing credit, use JUnit5 to verify your code with the following inputs and expected outputs.

| `arr1` | `arr2` | `mergedArr` | Expected value of `MergedInOrder.mergedIsInOrder(arr1, arr2, mergedArr)` | Exception |
|:----------:|:--------:|:--------:|:------------:|:----------------------------------------:|
| `{1, 4, 5}` | `{2, 3, 6}` | `{1, 2, 3, 4, 5, 6}` |`true` | (none) |
| `{}` | `{2, 3, 6}` | `{2, 3, 6}` |`true` | (none) |
| `{1, 5}` | `{2, 3, 6}` | `{1, 2, 6, 3, 5}` |`false` | (none) |
| `{1, 5}` | `{2, 3, 6}` | `{1, 6, 3, 5}` |`false` | (none) |
| `{1, 5}` | `{2, 3, 6}` | `{1, 2, 3, 5, 6, 8}` |`false` | (none) |
| `{1, 9}` | `{7, 8}` | `{1, 7, 8}` |`false` | (none) |
| `{55, 9}` | `{7, 8}` | `{1, 7, 8, 9}` |`false` | (none) |
| `{1, 2, 4}` | `{2, 3, 5}` | `{1, 2, 2, 4, 3, 5}` |(none) | `IllegalArgumentException` |
| `{1, 2, 4}` | `{1, 2, 4}` | `{1, 1, 4, 4, 2, 2}` |(none) | `IllegalArgumentException` |
| `{1, 5}` | `{2, 3, 5}` | `{1, 2, 3, 5, 5}` |(none) | `IllegalArgumentException` |
| `{1, 2, 5}` | `{2, 3, 6}` | `{1, 2, 3, 5, 6}` |(none) | `IllegalArgumentException` |

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Hints

* The `MergedInOrder.mergedIsInOrder` method to be completed is `static`. There is no need to create instances of `MergedInOder` (and arguably no benefit in doing so).  

* You may find it useful to create one or more additional `static` methods as "helpers"; the problem can be solved without doing so, however.

* Do not hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* The method to be completed includes a `TODO` comment to that effect.

* Note that the `assertThrows` JUnit5 assertion method may be used to verify that a method throws an expected exception under specific conditions. For more information, see <https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html#assertThrows-java.lang.Class-org.junit.jupiter.api.function.Executable->
