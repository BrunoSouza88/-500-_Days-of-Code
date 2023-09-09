public class Exercise {
    public static int countVowels(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }

    public static void main(String[] args) {
        String input1 = "Hello, World!";
        
        int result1 = countVowels(input1);

        System.out.println("Vowels in '" + input1 + "': " + result1);
    }
}
