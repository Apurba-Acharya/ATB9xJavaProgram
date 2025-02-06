package Task;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_31_UniqueChractersInAString {

    //Find the unique chracters in a string

    public static void main(String[] args) {
        String str = "aaggttbujj";

        //HashMap:
        char[] chrac = str.toCharArray();
        Map <Character , Integer> charCount = new HashMap<>();
        for (char ch : chrac){
           if (!charCount.containsKey(ch)){
               charCount.put(ch,1);
           }
        }
        System.out.println("HashMap: " + charCount.keySet());

        //HashSet:
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println("HashSet: " + set);
    }
}