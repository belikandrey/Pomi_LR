package by.bsuir.task25;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++) {
      array[i] = fibonachi(i);
    }
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }

  private static int fibonachi(int number) {
    if (number == 0 || number == 1) {
      return 1;
    }
    return fibonachi(number - 1) + fibonachi(number - 2);
  }
}
