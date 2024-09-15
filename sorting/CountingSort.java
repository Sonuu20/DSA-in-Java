package sorting;

//it is used when the range is short
public class CountingSort {
  public static void main(String[] args) {
    int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
    int largest = Integer.MIN_VALUE;

    // for calculating the maximum element in the array
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    // for indexing the element
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    // for sorting
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }

    // printing the elements
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
