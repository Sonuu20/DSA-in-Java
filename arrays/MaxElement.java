package arrays;

public class MaxElement {
    public static int Max(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = { 23, 342, 432, 33, 29 };
        int max = Max(numbers);
        System.out.println("The maximum element in the array is: " + max);
    }
}
