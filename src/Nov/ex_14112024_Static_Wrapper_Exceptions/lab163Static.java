package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class lab163Static {
    public static void main(String[] args) {

        students s1 = new students(28);
        students s2 = new students(8);

        System.out.println(students.school_name);
        students.school_name = "MNO";
        System.out.println(students.school_name);
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);

//        int a = s1.age;
//        System.out.println(students.age); >>non static in nature
    }
}

class students {
    int age; //not static variable
    static String school_name = "ABC";//static variable

    public students(int age) { //applied constructor
        this.age = age;
    }

    {
        System.out.println("IIB>> Intance Initialization block");
    }
    static {
        System.out.println("SIB>> Static Initialization block");
    }
}
