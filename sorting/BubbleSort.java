package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 4, 6 };
        int i, j, temp;
        boolean swapped;
        
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;  // Reset swapped for this pass
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }

        // Print the sorted array
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
