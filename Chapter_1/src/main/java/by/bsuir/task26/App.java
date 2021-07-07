package by.bsuir.task26;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int[] array = new int[12];
    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(31) - 15;
    }
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
    System.out.println();
    int min = array[0];
    int indMin = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] <= min) {
        min = array[i];
        indMin = i;
      }
    }
    System.out.println("Min el : " + min + " with ind : " + indMin);
  }
}
