package by.bsuir.task14;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number : ");
    int number = scanner.nextInt();
    scanner.close();
    if (isSimple(number)) {
      System.out.println("Simple!");
      return;
    }

    System.out.println("Not simple:(");
    for (int i = 2; i < number; i++) {
      if (number % i == 0 && isSimple(i)) {
        System.out.println("Simple : " + i);
      }
    }
  }

  private static boolean isSimple(int number) {
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
