package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class X1 {
    public static void main(String[] args) {
        String st = "seleniums";
        String str = st.toLowerCase();
        char c[] = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : c){
            if (hm.containsKey(ch)==false){
                hm.put(ch, 1);
            }else {
                hm.put(ch, hm.get(ch)+1);
            }
        }
        for (char c1 : hm.keySet()){
            if (hm.get(c1) >1){
                System.out.println(c1 + " : " + hm.get(c1));
            }
        }
    }
}
