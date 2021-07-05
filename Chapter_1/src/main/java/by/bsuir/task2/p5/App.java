package by.bsuir.task2.p5;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    number = scanner.nextInt();
    scanner.close();
    if (number < 1000 || number > 9999) {
      System.out.println("Invalid number");
      return;
    }
    int first = number / 1000;
    int second = number / 100 % 10;
    int preLast = number / 10 % 10;
    int last = number % 10;

    if (first != second
        && first != preLast
        && first != last
        && second != preLast
        && second != last
        && preLast != last) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
