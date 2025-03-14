# Algorithms Assignment : 2 
# Hana Ahmed Saeed Mohamed Rashad


```
import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    static int insertionSortComparisons = 0;
    static int mergeSortComparisons = 0;

    
    
    public static void insertionSort(int[] arr) {
        insertionSortComparisons = 0;
        int temp;
        int j;
        for(int i = 1 ; i < arr.length ; i++) {
            j = i-1; 
            temp = arr[i]; 
            while(j >= 0 && temp < arr[j]) { 
                insertionSortComparisons++;
                arr[j+1] = arr[j];
                j--; 
            }        
            if (j >= 0) insertionSortComparisons++; 
            arr[j + 1] = temp;
        }
    }

     public static void mergeSort(int[] arr) {
            int l = arr.length;
            if (l == 1) {
                return;
            }
            int middle = l / 2;
            int[] leftArr = Arrays.copyOfRange(arr, 0, middle);
            int[] rightArr = Arrays.copyOfRange(arr, middle, l);
            mergeSort(leftArr);
            mergeSort(rightArr);
            merge(arr, leftArr, rightArr);
        }
    
        private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
            int leftArrPointer = 0, rightArrPointer = 0, arrPointer = 0;
            while (leftArrPointer < leftArr.length && rightArrPointer < rightArr.length) {
                mergeSortComparisons++; 
                if (leftArr[leftArrPointer] <= rightArr[rightArrPointer]) {
                    arr[arrPointer++] = leftArr[leftArrPointer++];
                } else {
                    arr[arrPointer++] = rightArr[rightArrPointer++];
                }
            }
            while (leftArrPointer < leftArr.length) {
                arr[arrPointer++] = leftArr[leftArrPointer++];
            }
            while (rightArrPointer < rightArr.length) {
                arr[arrPointer++] = rightArr[rightArrPointer++];
            }
        }

    public static void main(String[] args) {
        Random random = new Random();
        int numTests = 1000;
        int arraySize = 1000;
        long totalInsertionComparisons = 0;
        long totalMergeComparisons = 0;

        for (int t = 0; t < numTests; t++) {
            int[] arr1 = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                arr1[i] = random.nextInt(10000);
            }
            int[] arr2 = arr1.clone();

            insertionSort(arr1);
            mergeSort(arr2);

            totalInsertionComparisons += insertionSortComparisons;
            totalMergeComparisons += mergeSortComparisons;
        }

        System.out.println("Average comparisons in Insertion Sort: " + (totalInsertionComparisons / numTests));
        System.out.println("Average comparisons in Merge Sort: " + (totalMergeComparisons / numTests));
    }
}

```

# Outputs 
`Average comparisons in Insertion Sort: 251040`
`Average comparisons in Merge Sort: 4358079`

# Comments 
Although Merge Sort has an asymptotically better time complexity (𝑂(𝑛log𝑛)) than Insertion Sort (𝑂(𝑛^2)), our experiment shows that Merge Sort performs more comparisons at 𝑛= 1000.
This is due to higher constant factors and recursion overhead in Merge Sort. However, as 𝑛 increases further, Merge Sort will outperform Insertion Sort.
