package Task;

import java.util.Scanner;

public class Practice_4_PalindromeString {

    /* Plalindrome String */

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a String: ");
//        String str = "nitin";
        String str = sc.next();

        String rev="";
        int len = str.length();
        for (int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println(str + " is Palindrome String");
        }else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
