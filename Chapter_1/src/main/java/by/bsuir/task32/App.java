package by.bsuir.task32;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int N = 6, M = 7;
    int array[][] = new int[N][M];
    array = fillArray(array);
    System.out.println("Array : ");
    printArray(array);
    array = editArray(array);
    System.out.println("New array : ");
    printArray(array);
  }

  private static int[][] editArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      int maxInd = getIndexMaxEl(array[i]);
      int temp = array[i][0];
      array[i][0] = array[i][maxInd];
      array[i][maxInd] = temp;
    }
    return array;
  }

  private static int getIndexMaxEl(int[] array) {
    int maxEl = array[0];
    int ind = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] > maxEl) {
        maxEl = array[i];
        ind = i;
      }
    }
    return ind;
  }

  private static int[][] fillArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = new Random().nextInt(10);
      }
    }
    return array;
  }

  private static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      Arrays.stream(array[i]).forEach((p) -> System.out.print(p + " "));
      System.out.println();
    }
  }
}
