package by.bsuir.task7;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int randNumber = (int) (Math.random() * 10 + 1);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    int userInput = scanner.nextInt();
    while (true) {
      if (userInput == randNumber) {
        System.out.println("You are right! Congrats!");
        scanner.close();
        return;
      }
      if (userInput < randNumber) {
        System.out.println("Your number less than rand");
      } else {
        System.out.println("Your number more than rand");
      }
      System.out.print("Enter number : ");
      userInput = scanner.nextInt();
    }
  }
}
