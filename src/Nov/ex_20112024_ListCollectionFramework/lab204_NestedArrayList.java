package Nov.ex_20112024_ListCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class lab204_NestedArrayList {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add("jaam");
        list1.add("butter");
        list1.add(true);
        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add("egg");
        list2.add("chicken");
        list2.add(13);
        list2.add(false);
        System.out.println(list2);

        List list3 = new ArrayList();
        list3.add(list1);
        list3.add(list2);
        System.out.println(list3);

        List list4 = new ArrayList();
        list4.add(list2);
        list4.add(list3);
        list4.add("vegitables");
        System.out.println(list4);
    }
}