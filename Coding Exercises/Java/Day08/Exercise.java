package Java.Day08;

public class Exercise {
    public static int[] swapNumbers(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        int[] result = {a, b};
        return result;
    }

    public static void main(String[] args) {
        int[] swapped = swapNumbers(10, 5);
        System.out.println("Swapped: [" + swapped[0] + ", " + swapped[1] + "]");
    }
}
