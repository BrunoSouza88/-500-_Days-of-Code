public class Exercise {
    
  public static String findLongerString(String str1, String str2) {
      if (str1 == null || str2 == null) {
          throw new IllegalArgumentException("Input strings cannot be null");
      }

      int length1 = str1.length();
      int length2 = str2.length();
      
      if (length1 > length2) {
          return str1;
      } else if (length2 > length1) {
          return str2;
      } else {
          return "Both strings are of equal length";
      }
  }
}
