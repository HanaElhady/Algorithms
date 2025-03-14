```
MERGE-SORT(A)
1. Let l = length(A)
2. If l == 1, return (Base case: single-element array is already sorted)
3. Compute middle index: middle = l / 2
4. Split A into two subarrays:
   - LeftArr = A[0 : middle] 
   - RightArr = A[middle : l]
5. Recursively sort LeftArr: MERGE-SORT(LeftArr)
6. Recursively sort RightArr: MERGE-SORT(RightArr)
7. Merge sorted subarrays: MERGE(A, LeftArr, RightArr)

```

```
MERGE(A, LeftArr, RightArr)
1. Initialize pointers: 
   - LeftArrPointer = 0
   - RightArrPointer = 0
   - ArrPointer = 0
2. While both LeftArr and RightArr have elements:
   - If LeftArr[LeftArrPointer] ≤ RightArr[RightArrPointer]:
       - A[ArrPointer] = LeftArr[LeftArrPointer]
       - Increment LeftArrPointer
   - Else:
       - A[ArrPointer] = RightArr[RightArrPointer]
       - Increment RightArrPointer
   - Increment ArrPointer
3. Copy any remaining elements from LeftArr to A:
   - While LeftArrPointer < length(LeftArr):
       - A[ArrPointer] = LeftArr[LeftArrPointer]
       - Increment LeftArrPointer and ArrPointer
4. Copy any remaining elements from RightArr to A:
   - While RightArrPointer < length(RightArr):
       - A[ArrPointer] = RightArr[RightArrPointer]
       - Increment RightArrPointer and ArrPointer
```
