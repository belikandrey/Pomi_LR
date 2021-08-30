package by.bsuir.task30;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    //    taskRofl();
    taskNormal();
  }

  // Rofl (will have to wait_)))))
  private static void taskRofl() {
    int[] array = new int[12];
    while (true) {
      int countNegative = 0, countPositive = 0;
      for (int i = 0; i < array.length; i++) {
        int number;
        do {
          number = new Random().nextInt(21) - 10;
        } while (number == 0);
        array[i] = number;
        if (number > 0) {
          countPositive++;
        } else {
          countNegative++;
        }
      }
      if (countNegative == countPositive) {
        printArray(array);
        break;
      }
    }
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }

  private static void taskNormal() {
    int array[] = new int[12];
    int countPositive = 0, countNegative = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(21) - 10;
      while (array[i] == 0) {
        array[i] = new Random().nextInt(21) - 10;
      }
      if (array[i] > 0) {
        countPositive++;
      } else {
        countNegative++;
      }
    }
    while (countNegative != countPositive) {
      int index = new Random().nextInt(12);
      if (array[index] > 0) {
        array[index] = -array[index];
        countPositive--;
        countNegative++;
      } else {
        array[index] = -array[index];
        countPositive++;
        countNegative--;
      }
    }
    printArray(array);
  }
}
