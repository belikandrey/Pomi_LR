package by.bsuir.task40;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int N = 8, M = 9;
    int array[][] = new int[N][M];
    array = fillArray(array);

    System.out.println("Array : ");
    printArray(array);

    array = updateArray(array);

    System.out.println("Array after changes : ");
    printArray(array);
  }

  private static int [][] updateArray(int [][] array){
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if(array[i][j]<0){
          array[i][j] = 0;
        }else if(array[i][j]>0){
          array[i][j] = 1;
        }
      }
    }
    return array;
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
