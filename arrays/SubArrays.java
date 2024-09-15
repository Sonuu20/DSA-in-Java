package arrays;

public class SubArrays {
    // for printing the elements of the subarray
    public static void PrintSubArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Brut force, Time comlexity - O(n^3)
    public static void MaxSubArraySum(int arr[]) {
        int currSum , maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + arr[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The sum of maximum subarray is: " + maxSum);
    }

    // more optimsed with only using 2 loops, time complexity - o(n^2)
    public static void MaxSubArraySum2(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calulating the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The sum of maximum subarray is: " + maxSum);
    }

    // Kadane Algorithm(improved for all negative no) - most optimised code , time complexity - O(n)
    public static void Kadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our Max Subarray Sum is: " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        // PrintSubArrays(arr);
        // MaxSubArraySum2(arr);
        Kadane(arr);
    }
}
