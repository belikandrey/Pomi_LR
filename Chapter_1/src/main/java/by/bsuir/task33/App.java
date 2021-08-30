package by.bsuir.task33;

import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int N = 8, M = 8;
    String array[][] = new String[N][M];
    array = fillArray(array);
    helpTeacher(array, 15);
    //If we need to use this array again, edit helpTeacher params to (array.clone(),15)
  }

  private static void helpTeacher(String[][] array, int countPairs) {
    for (int i = 0; i < countPairs; i++) {
      while (true) {
        int n = new Random().nextInt(8);
        int m = new Random().nextInt(8);
        if(array[n][m]==null){
          continue;
        }
        System.out.println(i+1 + " : "+array[n][m]);
        array[n][m] = null;
        break;
      }
    }
  }

  private static String[][] fillArray(String[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < i + 1; j++) {
        array[i][j] = (i + 2) + "*" + (j + 2);
      }
    }
    return array;
  }
}
