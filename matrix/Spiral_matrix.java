package matrix;

public class Spiral_matrix {

  public static void printSpiral(int matrix[][]) {
    int top = 0;
    int left = 0;
    int bottom = matrix.length - 1;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
      // left-right
      for (int j = left; j <= right; j++) {
        System.out.print(matrix[top][j] + " ");
      }
      top++; // Move the top boundary down

      // top-bottom
      for (int i = top; i <= bottom; i++) {
        System.out.print(matrix[i][right] + " ");
      }
      right--; // Move the right boundary left

      // Check if we still have rows to process
      if (top <= bottom) {
        // right-left
        for (int j = right; j >= left; j--) {
          System.out.print(matrix[bottom][j] + " ");
        }
        bottom--; // Move the bottom boundary up
      }

      // Check if we still have columns to process
      if (left <= right) {
        // bottom-top
        for (int i = bottom; i >= top; i--) {
          System.out.print(matrix[i][left] + " ");
        }
        left++; // Move the left boundary right
      }
    }
  }

  public static void main(String[] args) {
    int matrix[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };
    printSpiral(matrix);
  }
}
