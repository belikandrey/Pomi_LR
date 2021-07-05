package by.bsuir.task2.p3;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    number = scanner.nextInt();
    scanner.close();
    if (number > 9 && number < 100 && number % 2 == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
