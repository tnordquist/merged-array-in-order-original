## Value

* Basic implementation: 10 points
* Basic unit tests: 5 points

## Basic task

### Implementation

In the `edu.cnm.deepdive.MergedInOrder` class, the `nextPerfectSquare` method is declared with the following signature, return type, and modifiers:

```java
public static boolean mergedIsInOrder(int[] arr1, int[] arr2, int[] mergedArr)
```

For more method declaration details, see the [Javadoc documentation](docs/api/edu/cnm/deepdive/Square.html#nextPerfectSquare(long)).

For the basic task, complete the implementation of this method, according to the following specifications:

* If the array passed to `mergedArr` maintains the order of the arrays passed to `arr1, arr1`, mergedIsInOrder(arr1, arr2, mergedArr) must return `true`; if `mergedArr` does not maintain the order of `arr1, arr1`, it must return `false`. 

### Unit tests

For unit testing credit, use JUnit5 to verify your code with the following inputs and expected outputs.

| `arr1` | `arr2` | `mergedArr` | Expected value of `MergedInOrder.mergedIsInOrder(arr1, arr2, mergedArr)` | Exception |
|:--------:|:------:|:----:|:--------:|:----------------------------------------------------:|
| `{1, 4, 5}` | `{2, 3, 6}` | `{1, 2, 3, 4, 5, 6}` |`true` | (none) |
| `{}` | `{2, 3, 6}` | `{2, 3, 6}` |`true` | (none) |
| `{1, 5}` | `{2, 3, 6}` | `{1, 2, 6, 3, 5}` |`false` | (none) |
| `{1, 5}` | `{2, 3, 6}` | `{1, 6, 3, 5}` |`false` | (none) |
| `{1, 5}` | `{2, 3, 6}` | `{1, 2, 3, 5, 6, 8}` |`false` | (none) |
| `{1, 9}` | `{7, 8}` | `{1, 7, 8}` |`false` | (none) |
| `{55, 9}` | `{7, 8}` | `{1, 7, 8, 9}` |`false` | (none) |




