package Nov.ex_05112024_OPPS;

public class lab139_OOPs_ObjectClass_StudentsATB {   //***This is call runner class
    public static void main(String[] args) {
       StudentsATB_lab139_OOPs_ObjectClass s1 = new StudentsATB_lab139_OOPs_ObjectClass(); //***StudentsATB_lab139_OOPs_ObjectClass is getting called in the runner class
        //* s1 = object reference
        //* new StudentsATB_lab139_OOPs_ObjectClass(); = Object
        //* StudentsATB_lab139_OOPs_ObjectClass  = Class

       s1.name = "Pramod";
       //*** s1 = object reference using with atribute (name)
        s1.eat(10);
        s1.age = 10;
        System.out.println(s1.age);


       StudentsATB_lab139_OOPs_ObjectClass s2 = new StudentsATB_lab139_OOPs_ObjectClass();
       s2.name = "Amit";
       s2.address = "Kolkata";
       System.out.println(s2.address);
       s2.age = 20;
       int a = s2.walk2("50 KM");
       System.out.println("a: " + a);




    }
}
