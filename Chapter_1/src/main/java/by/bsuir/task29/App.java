package by.bsuir.task29;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = 0;
    do {
      System.out.print("Enter number : ");
      length = scanner.nextInt();
      if (length > 0) {
        break;
      } else {
        System.out.println("Invalid data. Try again...");
      }
    } while (true);
    scanner.close();
    int[] array = new int[length];

    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(11) - 5;
    }
    printArray(array);
    System.out.println();
    int sumLeft = 0, sumRight = 0;
    for (int i = 0; i < array.length; i++) {
      if (i < array.length / 2) {
        sumLeft += array[i];
      } else {
        sumRight += array[i];
      }
    }
    if (sumLeft == sumRight) {
      System.out.println("Sums equals");
    } else if (sumLeft < sumRight) {
      System.out.println("Sum right more than sum left");
    } else {
      System.out.println("Sum left more than sum right");
    }
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }
}
