package Task;

import java.util.Scanner;

public class task_22102024_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("**** Count number of vowel and consonant in a String");

        System.out.println("Enter a string  = ");

        String text = sc.nextLine().toLowerCase();
        int vowel = 0;
        int consonant = 0;
        char ch;
        for (int i = 0; i < text.length(); i++) {

            ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
                System.out.println(ch + " is a Vowel");
            } else if (ch == ' ') {
                continue;

            } else {
                consonant++;
                System.out.println(ch + " is a Consonant");
            }
        }
        System.out.println("Given String has " + vowel + " vowels");
        System.out.println("Given String has " + consonant + " consonants");
        sc.close();
    }
}
