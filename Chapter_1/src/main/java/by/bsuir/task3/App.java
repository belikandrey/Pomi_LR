package by.bsuir.task3;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    BigDecimal x, y;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter x : ");
    x = scanner.nextBigDecimal();
    System.out.print("Enter y : ");
    y = scanner.nextBigDecimal();
    scanner.close();
    BigDecimal halfSum = x.add(y).divide(BigDecimal.valueOf(2));
    BigDecimal doubleMultiply = x.multiply(y).multiply(BigDecimal.valueOf(2));
    if (x.compareTo(y) > 0) {
      x = doubleMultiply;
      y = halfSum;
    } else {
      x = halfSum;
      y = doubleMultiply;
    }
    System.out.println("X : " + x);
    System.out.println("Y : " + y);
  }
}
