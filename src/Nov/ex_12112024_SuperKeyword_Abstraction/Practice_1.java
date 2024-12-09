package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Practice_1 {
    public static void main(String[] args) {
        f7 f = new f7();
        f.family2();
    }
}

class f7 implements f1,f4{
    @Override
    public void f2() {
        System.out.println("f2");
    }

    @Override
    public void f3() {
        System.out.println("f3");
    }

    @Override
    public void f4() {
        System.out.println("f4");
    }

    void family2(){
        f2();
        f3();
        f4();
    }
}

interface f1{
    void f2();
    void f3();
}
interface f4{
    void f3();
    void f4();
}
