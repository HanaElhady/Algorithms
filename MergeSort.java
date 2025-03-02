import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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

}
