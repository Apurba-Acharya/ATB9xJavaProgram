package Task;

public class Practice_11_ReverseAnInteger {

    /* How to Reverse an Integer > critical questions */

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) return 0;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));   // Output: 54321
        System.out.println(reverse(-12345));  // Output: -54321
    }
}
