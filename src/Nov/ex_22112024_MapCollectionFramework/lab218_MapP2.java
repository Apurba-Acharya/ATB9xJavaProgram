package Nov.ex_22112024_MapCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class lab218_MapP2 {
    public static void main(String[] args) {
        Map <String,Integer> m2 = new HashMap();

        m2.put("id", 1);
        m2.put("id", 2);
        m2.put("id2", 2);
        m2.put("id3", 37);
        m2.put("id4", null);
        m2.put("id5", null);
        m2.put(null, 102);
        m2.put(null, 102); //duplicate key not allowed

        System.out.println(m2);
        System.out.println(m2.size());
        System.out.println(m2.isEmpty());
        System.out.println(m2.containsKey("id2"));
        System.out.println(m2.containsValue(10));

        System.out.println(m2.keySet());;
        System.out.println(m2.values());
        System.out.println(m2.get("id3"));

    }
}
