package by.bsuir.task18;

public class App {
  public static void main(String[] args) {
    taskV1();
    //    taskV2();
  }

  // Bad decision, but the easiest:)
  public static void taskV2() {
    int count = 0;
    for (int i = 1; i < 100000; i++) {
      String strNumber = String.valueOf(i);
      if (strNumber.contains("4") || strNumber.contains("13")) {
        count++;
      }
    }
    System.out.println("Count : " + count);
  }

  // Good version
  public static void taskV1() {
    int count = 0;
    for (int i = 0; i < 100000; i++) {
      for (int j = 1; j < 100000; j *= 10) {
        int lastNum = (i / j) % 10;
        int lastTwoNums = (i / j) % 100;
        if (lastNum == 4 || lastTwoNums == 13) {
          count++;
          break;
        }
      }
    }
    System.out.println(count);
  }
}
