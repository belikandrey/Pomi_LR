package by.bsuir.task24;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int[] array = new int[4];
    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(100 - 10) + 10;
    }
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
    System.out.println();
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] >= array[i + 1]) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
