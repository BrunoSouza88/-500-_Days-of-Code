

public class Exercise {
  public static void generateMultiplicationTable(int num) {
      for (int index = 1; index <= 10; index +=1) {
          int result = num * index;
          System.out.println(num + " x " + index + " = " + result);
      }
  }
}
