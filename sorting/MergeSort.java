package sorting;

public class MergeSort {
  static void mergesort(int arr[], int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2;
    mergesort(arr, low, mid);
    mergesort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  static void merge(int arr[], int low, int mid, int high) {
    int temp[] = new int[high - low + 1];
    int left = low;
    int x = 0;
    int right = mid + 1;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[x++] = arr[left++];
      } else {
        temp[x++] = arr[right++];
      }
    }
    while (left <= mid) {
      temp[x++] = arr[left++];
    }
    while (right <= high) {
      temp[x++] = arr[right++];
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp[i - low];
    }
  }

  public static void main(String args[]) {
    int n = 7;
    int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
    System.out.println("Before sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    mergesort(arr, 0, n - 1);
    System.out.println("After sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
