
### 1. Constant Time (`O(1)`, `Ω(1)`, `Θ(1)`)

```java
public class ConstantTime {
    public static int getFirstElement(int[] arr) {
        return arr[0];  // Constant time operation
    }
}
```

- **Upper Bound**: `O(1)`
  - This operation always takes the same amount of time, regardless of the array size. Accessing the first element is a direct memory access.
  
- **Lower Bound**: `Ω(1)`
  - The best case is the same: accessing the first element is constant time.
  
- **Average Case**: `Θ(1)`
  - The typical or average case also involves only one step, making the time constant.

---

### 2. Binary Search (`O(log n)`, `Ω(1)`, `Θ(log n)`)

```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;  // Element not found
    }
}
```

- **Upper Bound**: `O(log n)`
  - In the worst case, you keep halving the search space until it becomes small. Halving occurs `log n` times, so the maximum number of steps is proportional to `log n`.
  
- **Lower Bound**: `Ω(1)`
  - The best case occurs when the middle element is the target, so you find it in one step.
  
- **Average Case**: `Θ(log n)`
  - Typically, you’ll have to search through half the array repeatedly, which means logarithmic time is also the average case.

---

### 3. Linear Search (`O(n)`, `Ω(1)`, `Θ(n)`)

```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;  // Element not found
    }
}
```

- **Upper Bound**: `O(n)`
  - In the worst case, the target element could be the last element or not present at all, so you’d have to check all `n` elements.
  
- **Lower Bound**: `Ω(1)`
  - The best case happens when the target is the first element, found in one comparison.
  
- **Average Case**: `Θ(n)`
  - On average, the target will be found halfway through the array, meaning you'll need to search through `n/2` elements, which simplifies to `n`.

---

### 4. Merge Sort (`O(n log n)`, `Ω(n log n)`, `Θ(n log n)`)

```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}
```

- **Upper Bound**: `O(n log n)`
  - In the worst case, the array is split into halves `log n` times (because each division halves the size). Each level of recursion requires `n` comparisons to merge the arrays, so the time complexity becomes `n log n`.
  
- **Lower Bound**: `Ω(n log n)`
  - Even in the best case, the array must be split and merged the same way, resulting in `n log n` comparisons.
  
- **Average Case**: `Θ(n log n)`
  - Whether the input is random or ordered, the process of splitting and merging remains the same, meaning the average case is also `n log n`.

---

### 5. Bubble Sort (`O(n^2)`, `Ω(n)`, `Θ(n^2)`)

```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // Optimization if array is already sorted
        }
    }
}
```

- **Upper Bound**: `O(n^2)`
  - In the worst case (when the array is in reverse order), the algorithm has to make `n` passes, each involving up to `n` comparisons, leading to `n^2` comparisons.
  
- **Lower Bound**: `Ω(n)`
  - In the best case (if the array is already sorted), a single pass through the array is enough to verify that no swaps are needed, resulting in `n` comparisons.
  
- **Average Case**: `Θ(n^2)`
  - Typically, the algorithm will need multiple passes and comparisons, which results in quadratic time complexity.

---

### 6. Fibonacci (Recursive) (`O(2^n)`, `Ω(2^n)`, `Θ(2^n)`)

```java
public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
```

- **Upper Bound**: `O(2^n)`
  - In the worst case, the recursion tree grows exponentially. Each call to `fibonacci` makes two recursive calls, leading to `2^n` growth.
  
- **Lower Bound**: `Ω(2^n)`
  - Even in the best case, the recursive structure does not change, and the number of function calls remains exponential.
  
- **Average Case**: `Θ(2^n)`
  - The average case behaves similarly to the worst case because the recursive structure leads to exponential growth in function calls in both cases.
