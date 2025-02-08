package Task;

import java.util.*;

public class X1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 7};
        int n = 7;

        Set <Integer> hs = new HashSet<>();
        for (int b : a){
            hs.add(b); // return boolean;
        }
        for (int i = 1; i <=n ; i++) {
            if (hs.contains(i) == false){
                //hs.contains(i) == false : Compairing which "i" values is not present in "hs"
                //hs.contains(i) == true : Compairing which "i" values is present in "hs"
                System.out.println(i);
            }
        }
    }
    }