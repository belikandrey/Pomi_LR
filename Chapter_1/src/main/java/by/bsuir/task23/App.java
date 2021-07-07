package by.bsuir.task23;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int N = 5;
    int[] firstArray = new int[N], secondArray = new int[N];
    for (int i = 0; i < N; i++) {
      firstArray[i] = new Random().nextInt(6);
      secondArray[i] = new Random().nextInt(6);
    }
    printArray(firstArray);
    System.out.println();
    printArray(secondArray);
    System.out.println();
    int avgFirst = getAvg(firstArray);
    int avgSecond = getAvg(secondArray);
    String message =
        avgFirst == avgSecond
            ? "AVG of first array equals to second"
            : avgFirst < avgSecond
                ? "Avg of second array more than first"
                : "Avg of first array more than second";
    System.out.println(message);
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach((p) -> System.out.print(p + " "));
  }

  private static int getAvg(int[] array) {
    return Arrays.stream(array).sum() / array.length;
  }
}
