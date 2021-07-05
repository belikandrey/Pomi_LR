package by.bsuir.task2.p4;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    BigDecimal a, b, c;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a : ");
    a = scanner.nextBigDecimal();
    System.out.print("Enter b : ");
    b = scanner.nextBigDecimal();
    System.out.print("Enter c : ");
    c = scanner.nextBigDecimal();
    scanner.close();
    if (c.pow(2).equals(a.pow(2).add(b.pow(2)))) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
