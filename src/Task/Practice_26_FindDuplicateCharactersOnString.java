package Task;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_26_FindDuplicateCharactersOnString {

//    Find duplicate character on a string

    public static void main(String[] args) {
        String str = "programming";

        char arr[] = str.toCharArray();
        Map <Character, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        //Prining
        for (Character key : map.keySet()){
            if (map.get(key) > 1){
                System.out.println(key + " : " + map.get(key));
            }
        }

        //Using HashSet:
        char c[] = str.toCharArray();
        Set<Character> s = new HashSet<>();
        for (char c1 : c){
            if (s.contains(c1)){
                System.out.println("Duplicate: " + c1);
            }else {
                s.add(c1);
            }
        }
    }
}
