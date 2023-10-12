public class Exercise {
  static class Brother {
      String name;
      int age;
      
      Brother(String name, int age) {
          this.name = name;
          this.age = age;
      }
  }

  public static Brother findYoungestBrother(Brother[] brothers) {
      if (brothers.length == 0) {
          return null;
      }
      
      Brother youngest = brothers[0];

      for (int index = 1; index < brothers.length; index++) {
          if (brothers[index].age < youngest.age) {
              youngest = brothers[index];
          }
      }
      
      return youngest;
  }
}
