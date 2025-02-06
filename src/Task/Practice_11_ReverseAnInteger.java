package Task;

public class Practice_11_ReverseAnInteger {

    /* How to Reverse an Integer > critical questions */

    public static void main(String[] args) {
        int input = 1234;
        String str = String.valueOf(input); // valueOf(): Converting a integer value to string

        // Type 1:
        for (int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        // Type 2: Using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("Reversing using StringBuffer: " + sb);
    }
}