package Task;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        String str = "programming";

        char c[] = str.toCharArray();
        Set <Character> s = new HashSet<>();
        for (char c1 : c){
            if (s.contains(c1)){
                System.out.println("Duplicate: " + c1);
            }else {
                s.add(c1);
            }
        }
    }
}