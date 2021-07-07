package by.bsuir.task16;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    number = scanner.nextInt();
    scanner.close();
    int sum = 0;
    while (number > 0) {
      int lastNum = number % 10;
      number /= 10;
      sum += lastNum;
    }
    System.out.println("Sum is : " + sum);
  }
}
