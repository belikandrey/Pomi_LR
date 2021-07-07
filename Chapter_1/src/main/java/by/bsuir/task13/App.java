package by.bsuir.task13;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    number = scanner.nextInt();
    scanner.close();
    int i = 2;
    while (i < number) {
      if (number % i == 0) {
        System.out.println(i);
      }
      i++;
    }
  }
}
