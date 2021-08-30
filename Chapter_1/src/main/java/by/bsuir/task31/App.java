package by.bsuir.task31;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter n : ");
      n = scanner.nextInt();
      if (n > 3) {
        break;
      }
    }
    scanner.close();

    int[] array = new int[n];
    int countOfEven = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(n + 1);
      if (array[i] % 2 == 0) {
        countOfEven++;
      }
    }
    printArray(array);
    System.out.println();
    if (countOfEven == 0) {
      System.out.println("No.");
      return;
    }

    int[] secondArray = new int[countOfEven];
    for (int i = 0, j = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        secondArray[j++] = array[i];
      }
    }
    printArray(secondArray);
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }
}
