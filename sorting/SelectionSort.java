package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int i, j, minIndex, temp;

        for (i = 0; i < arr.length - 1; i++) {
            minIndex = i; // Assume the min element is at the current index i
            
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println("Printing the elements of sorted array: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
