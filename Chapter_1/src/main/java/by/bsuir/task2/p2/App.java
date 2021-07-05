package by.bsuir.task2.p2;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    number = scanner.nextInt();
    scanner.close();
    if (number < 100 || number > 999) {
      System.out.println("Invalid number");
      return;
    }
    int first = number / 100;
    int second = number / 10 % 10;
    int third = number % 10;
    if ((first + second + third) % 2 == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
