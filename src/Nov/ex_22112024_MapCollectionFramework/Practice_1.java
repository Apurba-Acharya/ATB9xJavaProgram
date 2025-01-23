package Nov.ex_22112024_MapCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Practice_1 {
    public static void main(String[] args) {
        Map <String,Integer> m2 = new HashMap();

        m2.put("id", 1);
        m2.put("id", 2);
        m2.put("id2", 2);
        m2.put("id3", 37);
        m2.put("id4", null);
        m2.put("id5", null);
        m2.put(null, 102);
        m2.put(null, 102);

        System.out.println(m2.values());
    }
}
