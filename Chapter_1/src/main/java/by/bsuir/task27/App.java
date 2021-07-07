package by.bsuir.task27;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int[] firstArray = new int[10], secondArray = new int[10];
    double[] thirdArray = new double[10];
    for (int i = 0; i < firstArray.length; i++) {
      firstArray[i] = new Random().nextInt(9) + 1;
      secondArray[i] = new Random().nextInt(9) + 1;
    }
    for (int i = 0; i < thirdArray.length; i++) {
      thirdArray[i] = (double) firstArray[i] / secondArray[i];
    }
    printArray(firstArray);
    System.out.println();
    printArray(secondArray);
    System.out.println();
    printArray(thirdArray);
    System.out.println();
    for (int i = 0; i < thirdArray.length; i++) {
      if (thirdArray[i] - (int) thirdArray[i] < Double.MIN_VALUE) {
        System.out.println("Int : " + thirdArray[i]);
      }
    }
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }

  private static void printArray(double[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }
}
