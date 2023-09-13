package Java.Day07;

public class Exercise {
  public static String removeSpaces(String input) {
      return input.replaceAll(" ","");
  }
}

// Using StringBuilder
// public class Exercise {
//     public static String removeSpaces(String input) {
//         StringBuilder result = new StringBuilder();
//         for (char c : input.toCharArray()) {
//             if (c != ' ') {
//                 result.append(c);
//             }
//         }
//         return result.toString();
//     }
// }

// Using regular expressions
// public class Exercise {
//     public static String removeSpaces(String input) {
//         return input.replaceAll("\\s+", "");
//     }
// }