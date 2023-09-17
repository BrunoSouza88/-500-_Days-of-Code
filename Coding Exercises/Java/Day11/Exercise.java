package Java.Day11;

public class Exercise {
    public static String toggleCase(String s) {
        StringBuilder toggledString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c);
            }
        }

        return toggledString.toString();
    }
}
