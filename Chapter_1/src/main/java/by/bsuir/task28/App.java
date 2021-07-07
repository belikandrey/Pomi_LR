package by.bsuir.task28;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int[] array = new int[11];
    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(3) - 1;
    }
    printArray(array);
    System.out.println();
    int countOfMinOne = getCount(array, -1);
    int countOfZero = getCount(array, 0);
    int countOfOne = getCount(array, 1);
    if (countOfOne == countOfZero || countOfOne == countOfMinOne || countOfZero == countOfMinOne) {
      return;
    }
    if (countOfOne > countOfZero && countOfOne > countOfMinOne) {
      System.out.println("Count of ONE!");
    } else if (countOfZero > countOfOne && countOfZero > countOfMinOne) {
      System.out.println("Count of ZERO!");
    } else {
      System.out.println("Count of MINUS ONE!");
    }
  }

  private static int getCount(int[] array, int num) {
    return (int) Arrays.stream(array).filter((p) -> p == num).count();
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }
}
