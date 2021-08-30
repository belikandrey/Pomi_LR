package by.bsuir.task39;

import java.util.Arrays;
import java.util.Random;

/** The type App. */
public class App {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    int N = 8, M = 9, k = 3;
    int array[][] = new int[N][M];
    array = fillArray(array);

    System.out.println("Array : ");
    printArray(array);

    Result result = getMaxAbsElementIndexes(array);

    System.out.println("Row : " + result.getRow() + ", Col : " + result.getCol());

    array = changeRowsAndCols(array, result, k);

    System.out.println("After changes : ");
    printArray(array);
  }

  private static int[][] changeRowsAndCols(int array[][], Result result, int k) {
    if (k >= array.length || k >= array[0].length) {
      throw new RuntimeException("K must be less than N and M");
    }

    array = changeRows(array, k, result);

    array = changeCols(array, k, result);

    return array;
  }

  private static int[][] changeRows(int[][] array, int k, Result result) {
    int[] temp = array[result.getRow()];
    array[result.getRow()] = array[k];
    array[k] = temp;
    return array;
  }

  private static int[][] changeCols(int array[][], int k, Result result) {
    for (int i = 0; i < array.length; i++) {
      int temp = array[i][result.getCol()];
      array[i][result.getCol()] = array[i][k];
      array[i][k] = temp;
    }
    return array;
  }

  private static Result getMaxAbsElementIndexes(int array[][]) {
    int maxAbs = Math.abs(array[0][0]);
    Result result = new Result(0, 0);
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (Math.abs(array[i][j]) > maxAbs) {
          maxAbs = Math.abs(array[i][j]);
          result.setRow(i);
          result.setCol(j);
        }
      }
    }
    return result;
  }

  private static int[][] fillArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = new Random().nextInt(100) - 50;
      }
    }
    return array;
  }

  private static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      Arrays.stream(array[i]).forEach((p) -> System.out.printf("%6d\t", p));
      System.out.println();
    }
  }

  private static class Result {
    /** The Row. */
    private int row;

    /** The Col. */
    private int col;

    /**
     * Instantiates a new Result.
     *
     * @param row the row
     * @param col the col
     */
    public Result(int row, int col) {
      this.row = row;
      this.col = col;
    }

    /**
     * Gets row.
     *
     * @return the row
     */
    public int getRow() {
      return row;
    }

    /**
     * Sets row.
     *
     * @param row the row
     */
    public void setRow(int row) {
      this.row = row;
    }

    /**
     * Gets col.
     *
     * @return the col
     */
    public int getCol() {
      return col;
    }

    /**
     * Sets col.
     *
     * @param col the col
     */
    public void setCol(int col) {
      this.col = col;
    }
  }
}
