package by.bsuir.task1;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.print("Enter n : ");
    Scanner scanner = new Scanner(System.in);
    double n = scanner.nextDouble();
    scanner.close();
    for (int i = 0; i < 4; i++) {
      System.out.println("n^" + i + " = "+Math.pow(n, i));
    }
  }
}
