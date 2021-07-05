package by.bsuir.task6;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.print("Enter N : ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.print("Enter k : ");
    int k = scanner.nextInt();
    scanner.close();
    int sum = 0;
    for (int i = 1; i < Math.pow(10, n); i++) {
      if (i % k == 0) {
        sum += i;
      }
    }
    System.out.println("Sum is : " + sum);
  }
}
