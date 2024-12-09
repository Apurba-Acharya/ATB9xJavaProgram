package Nov.ex_19112024_Gnerics_WhyCollectationsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class lab199_arraylist {
    public static void main(String[] args) {
        //    Collection list = new ArrayList();
            List list2 = new ArrayList();
        //ArrayList list2 = new ArrayList();
        list2.add("dutta");
        list2.add("anil");
        list2.add("amit");
        list2.add("dutta");
        list2.add(true);
        list2.add(125);
        list2.add(null);

        System.out.println(list2);
        Object o = list2.get(5);
        System.out.println(o);

    }
}
