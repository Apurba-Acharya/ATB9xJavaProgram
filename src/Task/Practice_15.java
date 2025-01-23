package Task;

import java.util.Scanner;

public class Practice_15 {

    /* Count vowels and consonants in a String */

    public int[] countVowelsCons(String str) {
        int vCount = 0;
        int cCount = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if(ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }
        return new int[]{vCount, cCount};
    }

    public static void main(String[] args) {
        Practice_15 counter = new Practice_15();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string value: ");
        //String input = sc.nextLine();
        int[] result = counter.countVowelsCons(sc.nextLine());
        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);
    }
}