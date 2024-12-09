package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab213_SET_HS_TS {
    public static void main(String[] args) {
        Set hs = new HashSet(); //hashing mechanism //Most important in automation
        hs.add("apple");
        hs.add("Orange");
        hs.add("banana");
        hs.add("Orange");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("banana");
        lhs.add("Orange");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet();
        //Set <String> ts = new TreeSet(); //can use
        ts.add("apple");
        ts.add("Orange");
        ts.add("banana");
        ts.add("Orange");
        //ts.add(125); // Not allowed different data type
//        ts.add(null); //Not allowed***
//        ts.add(null);
        System.out.println(ts);
        for (Object o: ts) {
            System.out.println(o);
        }
    }
}
