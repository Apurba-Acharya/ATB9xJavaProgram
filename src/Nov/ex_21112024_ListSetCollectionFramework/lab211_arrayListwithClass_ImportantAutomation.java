package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class lab211_arrayListwithClass_ImportantAutomation {
    public static void main(String[] args) {
        lab211_Student s1 = new lab211_Student(10, "amit");
        lab211_Student s2 = new lab211_Student(11, "aloww");
        lab211_Student s3 = new lab211_Student(12, "amrt");

        List <lab211_Student> m1 = new ArrayList(); //Most important in automation
        m1.add(s1);
        m1.add(s2);
        m1.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();


        System.out.println("Print indivisual value: " + m1.get(0).getName() + " "+ m1.get(0).getRollNo());
    }
}
