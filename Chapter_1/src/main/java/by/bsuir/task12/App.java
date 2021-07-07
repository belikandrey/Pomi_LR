package by.bsuir.task12;

public class App {
  public static void main(String[] args) {
    int a = -166;
    while (a < 100) {
      if (a > 9 || (a > -100 && a < -9)) {
        System.out.println(a);
      }
      a = 2 * a + 200;
    }
  }
}
