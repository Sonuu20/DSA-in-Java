package sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int arr[] = { 5, 3, 1, 4, 6 };
    int i;

    for (i = 1; i < arr.length - 1; i++) {
      int curr = arr[i]; // upto unsorted part
      int prev = i - 1; // upto sorted part

      // finding out the correct pos to insert
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      // inserting the element after finding out
      arr[prev + 1] = curr;
    }

    // printing the elements
    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
    }
  }
}
