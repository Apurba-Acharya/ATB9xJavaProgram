package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab160_Interface_P3 {
    public static void main(String[] args) {
        child c = new child();
        c.family();
    }
}

class child implements father,mother{
    @Override
    public void f1() {
        System.out.println("father -> f1 Done");
    }

    @Override
    public void f2() {
        System.out.println("father and mother -> f2 Done");
    }

    @Override
    public void f3() {
        System.out.println("mother -> f3 Done");
    }
    void family (){
        f1();
        f2();
        f3();
    }
}

interface father{
    void f1();
    void f2();
}
interface mother{
    void f2();
    void f3();
}