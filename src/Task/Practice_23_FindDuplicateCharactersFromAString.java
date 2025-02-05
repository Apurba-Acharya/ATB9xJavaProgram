package Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice_23_FindDuplicateCharactersFromAString {
    public static void findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count character occurrences
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String newStr = sc.next();
        String str = newStr.toLowerCase();
        findDuplicates(str);
    }
}
