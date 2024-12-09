package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class lab211_arrayListwithClass {
    public static void main(String[] args) {
        Student s1 = new Student(10, "amit");
        Student s2 = new Student(11, "aloww");
        Student s3 = new Student(12, "amrt");

        s1.print();
        s2.print();
        s3.print();

        List <Student> m1 = new ArrayList(); //Most important in automation
        m1.add(s1);
        m1.add(s2);
        m1.add(s3);

        System.out.println(m1);

    }
}
