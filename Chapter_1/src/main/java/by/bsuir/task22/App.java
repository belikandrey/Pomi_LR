package by.bsuir.task22;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int[] array = new int[8];
    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(10) + 1;
    }
    printArray(array);
    System.out.println();
    for (int i = 0; i < array.length; i++) {
      if (i % 2 != 0) {
        array[i] = 0;
      }
    }
    printArray(array);
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }
}
