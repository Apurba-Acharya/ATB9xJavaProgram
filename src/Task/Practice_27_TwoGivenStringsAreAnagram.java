package Task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice_27_TwoGivenStringsAreAnagram {

//    Check two given strings are anagram

    public static void main(String[] args) {
        String str1 = "stop";
        String str2 = "tops";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("String is anagram");
        }else {
            System.out.println("String is not anagram");
        }
    }
}
