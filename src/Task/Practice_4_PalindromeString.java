package Task;

import java.util.Scanner;

public class Practice_4_PalindromeString {

    /* Plalindrome String */

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a String: ");
//        String str = sc.next();
        String str = "apu";


        //Type 1:
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }

        //Type2:
        String st[] = str.split("");
        String reverse = ""; //For palindome checking purpose we are storing value outside the loop
        for (int i = st.length - 1; i >= 0; i--) {
            reverse = reverse + st[i];

            //System.out.print(st[i]); // Only for reverse a string we can use st[i].
        }
        System.out.println("After Palindome: " + reverse);
        if (str.equals(reverse)) {
            System.out.println("palindome");
        } else {
            System.out.println("not palindome");
        }
    }
}
