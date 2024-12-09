package Task;

public class task0001 {
    public static void main(String[] args) {
        child3 c9 = new child3();
        c9.f();
    }

}

class father {
    void f(){
        System.out.println("3BHK");
    }
}

class child3 extends father {
    void f(){
        System.out.println("2bhk");
    }
}
