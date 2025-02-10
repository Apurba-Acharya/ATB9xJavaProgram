package Task;

import java.util.*;

public class X1 {
    public static void main(String[] args) {
        String str = "progrAAmming";

        String s = str.toLowerCase();
//        char ch[] = s.toCharArray(); //Using this also possible
        String st[] = s.split("");

        Set <String> hs = new HashSet<>();
        hs.add("a");
        hs.add("e");
        hs.add("i");
        hs.add("o");
        hs.add("u");

        int vc = 0;
        int cc = 0;

        for ( String c : st){
            if (hs.contains(c)){
                vc++;
            } else {
                cc++;
            }
        }
        System.out.println("Vouel: "+vc);
        System.out.println("Consonent: "+cc);
    }
}