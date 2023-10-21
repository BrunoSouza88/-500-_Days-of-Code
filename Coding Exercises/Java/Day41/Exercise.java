package Java.Day41;

public class Exercise {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    
        return true;
    }
}

