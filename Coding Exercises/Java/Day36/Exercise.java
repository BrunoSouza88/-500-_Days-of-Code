public class Exercise {
    public static String evaluateGrade(int marks){
        
        if (marks < 0 || marks > 100) {
            return "Invalid";
        } else if (marks < 40) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
}
