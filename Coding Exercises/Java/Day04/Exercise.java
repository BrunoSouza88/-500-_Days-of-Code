package Java.Day04;
public class Exercise {
  public static String reverseString(String str) {
    StringBuilder stringOne = new StringBuilder(str);
    stringOne.reverse();
    String stringReversed = stringOne.toString();
    return stringReversed;
  }
}

// public class Exercise {
//     public static String reverseString(String str) {
//         return new StringBuilder(str).reverse().toString();
//     }
// }
