package Task;

import java.util.HashSet;
import java.util.Set;

public class X1 {
    public static void main(String[] args) {
        String str = "aaggttbujj";
        char[] chrac = str.toCharArray();

        Set <Character> hs = new HashSet<>();
        String uWrords = "";
        for (char c : chrac){
            if (hs.add(c)==true){
                uWrords = uWrords + c;
            }
        }
        System.out.println(uWrords);
    }
}
