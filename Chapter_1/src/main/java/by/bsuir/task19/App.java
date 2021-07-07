package by.bsuir.task19;

import java.util.Random;

public class App {
  public static void main(String[] args) {
    int number = new Random().nextInt(156);
    if (number < 100 && number > 25) {
      System.out.println("Number : " + number + " is contained in the interval");
    }
  }
}
