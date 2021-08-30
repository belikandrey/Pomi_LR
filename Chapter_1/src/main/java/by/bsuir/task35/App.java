package by.bsuir.task35;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int N = 8, M = 9;
    int array[][] = new int[N][M];
    array = fillArray(array);
    System.out.println("Array : ");
    printArray(array);

    int count = getCountSpecialElements(array);

    System.out.println("Count : "+count);
  }

  private static int getCountSpecialElements(int[][] array) {
    int k = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if(array[i][j]>getSumColumn(array, j)-array[i][j]){
          k++;
        }
      }
    }
    return k;
  }

  private static int getSumColumn(int[][] array, int columnInd){
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum+=array[i][columnInd];
    }
    return sum;
  }

  private static int[][] fillArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = new Random().nextInt(100)-50;
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
}
