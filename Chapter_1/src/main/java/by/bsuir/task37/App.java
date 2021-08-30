package by.bsuir.task37;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int N = 8, M = 9;
    int array[][] = new int[N][M];
    array = fillArray(array);

    System.out.println("Array : ");
    printArray(array);

    array = editArray(array);

    System.out.println("Array after changes : ");
    printArray(array);
  }

  private static int[][] editArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      int max = array[i][0];
      int maxInd = 0;
      int min = max;
      int minInd = maxInd;
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
          maxInd = j;
        }
        if (array[i][j] < min) {
          min = array[i][j];
          minInd = j;
        }
      }
      array[i][maxInd] = array[i][0];
      array[i][0] = max;
      array[i][minInd] = array[i][array[i].length - 1];
      array[i][array[i].length - 1] = min;
    }
    return array;
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
}
