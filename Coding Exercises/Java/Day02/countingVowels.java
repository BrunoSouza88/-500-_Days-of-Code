public class Exercise {
    public static int countVowels(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }
}
