package by.bsuir.task4;

import java.util.Scanner;

public class App {
  private static final String PASSWORD;

  static {
    PASSWORD = "BSUIR112!";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userPassword = null;
    do{
      System.out.print("Enter password : ");
      userPassword = scanner.nextLine();
    }while (!PASSWORD.equals(userPassword));
    System.out.println("Yes! Right password!");
    scanner.close();
  }
}
