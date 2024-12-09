package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab160_Interface_P1 {
}


abstract class ABC{
    ABC(){
        System.out.println("no issue constructor");
    }

    abstract void m1();

    void m2(){
        System.out.println("compleate Method !!!");
    }
}

interface I{
    void m1();
    void m2();
    void m3();

    default void m4(){
        System.out.println("default method 1");
    }
    default void m5(){
        System.out.println("default method 2");
    }
    static void m6(){
        System.out.println("static method in interface");
    }
}
