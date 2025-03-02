/*
1. Basic Case
Input:
[5, 3, 8, 4, 2]
Expected Output:
[2, 3, 4, 5, 8]

2. Already Sorted Array (Best Case)
Input:
[1, 2, 3, 4, 5]
Expected Output:
[1, 2, 3, 4, 5]

(Verifies if the algorithm doesn't make unnecessary swaps.)

3. Reverse Sorted Array (Worst Case)
Input:
[9, 7, 5, 3, 1]
Expected Output:
[1, 3, 5, 7, 9]

(Checks if the algorithm properly sorts a descending list.)

4. Duplicate Elements
Input:
[4, 2, 4, 1, 3, 2]
Expected Output:
[1, 2, 2, 3, 4, 4]

(Ensures the algorithm handles repeated elements correctly.)

5. Single Element
Input:
[7]
Expected Output:
[7]

(Edge case: should return the same single element.)
 */

public class Main {
    public static void main(String[] args ) {
    int[] arr = {9, 7, 5, 3, 1};
    int temp;
    int j;
    for(int i = 1 ; i < arr.length ; i++) {
        j = i-1; // j = 2
        temp = arr[i]; //temp = 1 i=3
        while(j >= 0 && temp < arr[j]) { // 1 < arr[0] 1 < 0 no
            arr[j+1] = arr[j]; //arr[2] = arr[1]  arr[2] = 3
            j--; // j = 0
        }
        arr[j+1] = temp; //arr[1] = 1
    }

    for(int i = 0 ; i < arr.length ; i++) {
        System.out.print(arr[i] + " ");
    }
    }
}
