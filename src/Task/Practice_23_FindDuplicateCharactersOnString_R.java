package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_23_FindDuplicateCharactersOnString_R {

//    Find duplicate character on a string

    public static void main(String[] args) {
        String str = "programming";

        char arr[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        //Prining
        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " : " + map.get(key));
            }
        }

        //Using HashSet (.contains):
        char c1[] = str.toCharArray();
        Set<Character> s2 = new HashSet<>();
        for (char c2 : c1) {
            if (s2.contains(c2)) {
                System.out.println("Duplicates using .containes in HashSet:  " + c2);
            } else {
                s2.add(c2);
            }
        }

        //Using HashSet (.add):
        char c3[] = str.toCharArray();
        Set<Character> s3 = new HashSet<>();
        for (char c4 : c3) {
            if (s3.add(c4) == false) {
                System.out.println("Duplicates using .add in HashSet: " + c4);
            }
        }
    }
}
