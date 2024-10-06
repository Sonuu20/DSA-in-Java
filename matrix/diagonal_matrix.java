package matrix;

public class diagonal_matrix {
  // done using brut force - O(N*2)
  public static int diagonalSum(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        // for primary diagonal
        if (i == j) {
          sum += matrix[i][j];
        }
        // for secondary diagonal
        else if (i + j == matrix.length - 1) {
          sum += matrix[i][j];
        }
      }
    }
    return sum;
  }

  public static int diagonal(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      // for primal digonal
      sum += matrix[i][i];
      // for secondary diagonal
      if (i != matrix.length - 1 - i) {
        sum += matrix[i][matrix.length - i - 1];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
    int sum = diagonal(matrix);
    System.err.println("Sum of diagonal matrix is: " + sum);
  }
}
