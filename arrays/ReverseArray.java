package arrays;
//time Complexity - O(n)
//Space Complexity - O(1)
public class ReverseArray {
    public static void reverse(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start != end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(arr);
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
