package Nov.ex_20112024_ListCollectionFramework;

import java.util.*;

public class Pratice_1 {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(987);
        l1.add(10);
        l1.add(13);

        Collections.sort(l1);
        System.out.println(l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
    }
}
