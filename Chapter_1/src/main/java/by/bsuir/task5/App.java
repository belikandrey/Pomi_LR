package by.bsuir.task5;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.print("Enter N : ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int sum = 0;
    for (int i = 1; i < Math.pow(10, n); i++) {
      sum += i;
    }
    System.out.println("Sum is : " + sum);
  }
}
