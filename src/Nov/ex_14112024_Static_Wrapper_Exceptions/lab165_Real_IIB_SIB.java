package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class lab165_Real_IIB_SIB {
    public static void main(String[] args) {
        ATB s1 = new ATB("amit1");
        ATB s2 = new ATB("amit2");
        ATB s3 = new ATB("amit3");
//        String d = s2.getName();
//        System.out.println(d);
        new ATB("atanu");

        s1.readDoc();
        s2.readDoc();

        //Static
        ATB.doAssign();  //static method
        System.out.println(ATB.courseName); //static variable

    }

}

class ATB{
    {
        System.out.println("IIB");

        System.out.println("Reading from CSV");
    }
    static {
        System.out.println("SIB >> after loading the class SIB will execute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB9x";

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    void readDoc(){
        System.out.println("thsi is non static funtions");
        System.out.println(courseName);
        System.out.println(phone);
    }
    static void doAssign(){
        //System.out.println(phone); //>>can't access
        System.out.println("DO Assignment");
    }
}