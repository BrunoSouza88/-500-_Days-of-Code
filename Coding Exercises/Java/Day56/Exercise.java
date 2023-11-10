public class Exercise {

  public static boolean areEqual(Object arg1, Object arg2) {
      if (arg1 == null && arg2 == null) {
          return true;
      }

      if ((arg1 == null && arg2 != null) || (arg1 != null && arg2 == null)) {
          return false;
      }

      return arg1.equals(arg2);
  }

  public static void main(String[] args) {
      System.out.println(areEqual(5, 5));
      System.out.println(areEqual("hello", "hello"));
      System.out.println(areEqual(null, 5));
      System.out.println(areEqual(5, "5"));
  }
}
