package by.bsuir.task17;

public class App {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i < 1000000; i++) {
      int sumLast = 0;
      for (int n = 1; n < 1000; n *= 10) {
        sumLast += (i / n) % 10;
      }
      int sumFirst = 0;
      for (int n = 1000; n < 1000000; n *= 10) {
        sumFirst += (i / n) % 10;
      }
      if (sumFirst == sumLast) {
        count++;
      }
    }
    System.out.println("Count : " + count);
  }
}
