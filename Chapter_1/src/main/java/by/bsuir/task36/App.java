package by.bsuir.task36;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int N = 8;
    int array[][] = new int[N][N];
    array = fillArray(array);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    int userNumber = scanner.nextInt();
    scanner.close();

    System.out.println("Array : ");
    printArray(array);

    int indMax = getIndMaxOnMainDiag(array);

    if (indMax == userNumber) {
      System.out.println("This is equals rows!");
      return;
    }

    int[] temp = array[userNumber];
    array[userNumber] = array[indMax];
    array[indMax] = temp;

    System.out.println("Array after changes : ");
    printArray(array);
  }

  private static int getIndMaxOnMainDiag(int[][] array) {
    int max = array[0][0];
    int ind = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i][i] > max) {
        max = array[i][i];
        ind = i;
      }
    }
    return ind;
  }

  private static int[][] fillArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = new Random().nextInt(100) - 50;
      }
    }
    return array;
  }

  private static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      Arrays.stream(array[i]).forEach((p) -> System.out.printf("%6d\t", p));
      System.out.println();
    }
  }
}
