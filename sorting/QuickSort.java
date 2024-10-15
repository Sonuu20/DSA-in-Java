package sorting;

public class QuickSort {
  public static void quicksort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quicksort(arr, low, pi - 1);
      quicksort(arr, pi + 1, high);
    }
  }

  public static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j <= high - 1; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return i + 1;
  }

  public static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void main(String args[]) {
    int n = 7;
    int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
    System.out.println("Before sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    quicksort(arr, 0, n - 1);
    System.out.println("After sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
