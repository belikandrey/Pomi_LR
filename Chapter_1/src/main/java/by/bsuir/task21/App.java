package by.bsuir.task21;

import java.util.Random;

public class App {
  public static void main(String[] args) {
    int randNum = new Random().nextInt(28801);
    System.out.println("For Petrov : " + randNum);
    int hours = randNum / 3600;
    int minutes = (randNum - hours * 3600) / 60;
    System.out.println("Left " + hours + " hours and " + minutes + " minutes");
  }
}
