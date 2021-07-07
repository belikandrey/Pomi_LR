package by.bsuir.task30;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    //Rofl (will have to wait_)))))
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
}
