package by.bsuir.task20;

import java.util.Random;

public class App {
  public static void main(String[] args) {
    int number = new Random().nextInt(1000 - 100) + 100;
    int max = 0;
    int temp = number;
    while (temp > 0) {
      if (number % 10 > max) {
        max = number % 10;
      }
      temp /= 10;
    }
    System.out.println("In number : " + number + " biggest digit : " + max);
  }
}
