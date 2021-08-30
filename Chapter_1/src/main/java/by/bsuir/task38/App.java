package by.bsuir.task38;

import java.util.Arrays;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int N = 3;
    int array[][] = new int[N][N];
    array = fillArray(array);

    System.out.println("Array : ");
    printArray(array);

    boolean isMagic = isMagic(array);

    System.out.println(isMagic ? "Magiccccc!!!" : "Not magic...:(");
  }

  private static boolean isMagic(int[][] array) {
    int firstSum = getSum(array, 0, true);
    for (int i = 0; i < array.length; i++) {
      if (getSum(array, i, true) != firstSum) {
        return false;
      }
      if (getSum(array, i, false) != firstSum) {
        return false;
      }
    }
    return true;
  }

  private static int getSum(int[][] array, int num, boolean isRow) {
    int sum = 0;
    if (isRow) {
      for (int i = 0; i < array[num].length; i++) {
        sum += array[num][i];
      }
    } else {
      for (int i = 0; i < array.length; i++) {
        sum += array[i][num];
      }
    }
    return sum;
  }

  private static int[][] fillArray(int[][] array) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        array[i][j] = scanner.nextInt();
      }
    }
    scanner.close();
    return array;
  }

  private static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      Arrays.stream(array[i]).forEach((p) -> System.out.printf("%6d\t", p));
      System.out.println();
    }
  }
}
