package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class lab211_arrayListwithClass {
    public static void main(String[] args) {
        lab211_Student s1 = new lab211_Student(10, "amit");
        lab211_Student s2 = new lab211_Student(11, "aloww");
        lab211_Student s3 = new lab211_Student(12, "amrt");

        s1.print();
        s2.print();
        s3.print();

        List <lab211_Student> m1 = new ArrayList(); //Most important in automation
        m1.add(s1);
        m1.add(s2);
        m1.add(s3);

        System.out.println(m1);

    }
}
