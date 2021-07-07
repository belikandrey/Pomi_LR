package by.bsuir.task15;

public class App {
  public static void main(String[] args) {
    for (int i = 0; i < 11; i++) {
      System.out.println(i + 1 + "# = " + fibonachi(i));
    }
  }

  private static int fibonachi(int number) {
    if (number == 0 || number == 1) {
      return 1;
    }
    return fibonachi(number - 1) + fibonachi(number - 2);
  }
}
