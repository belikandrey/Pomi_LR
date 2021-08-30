package by.bsuir.task34;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int N = 8;
    int array[][] = new int[N][N];
    array = fillArray(array);
    System.out.println("Array : ");
    printArray(array);

    System.out.println();
    Result result = getSumAndCount(array);

    System.out.println(result);
  }

  private static Result getSumAndCount(int array[][]) {
    int sum = 0;
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = array.length - 1; j > i; j--) {
        sum += array[i][j];
        count++;
      }
    }
    return new Result(sum, count);
  }

  private static int[][] fillArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = new Random().nextInt(10);
      }
    }
    return array;
  }

  private static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      Arrays.stream(array[i]).forEach((p) -> System.out.print(p + " "));
      System.out.println();
    }
  }

  private static class Result {
    int sum;
    int count;

    public Result(int sum, int count) {
      this.sum = sum;
      this.count = count;
    }

    public int getSum() {
      return sum;
    }

    public int getCount() {
      return count;
    }

    @Override
    public String toString() {
      return "Result : sum=" + sum + ", count=" + count;
    }
  }
}
