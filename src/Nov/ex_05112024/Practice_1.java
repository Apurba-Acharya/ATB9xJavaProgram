package Nov.ex_05112024;

public class Practice_1 {
    public static void main(String[] args) {
        cab c1 = new cab();
        c1.name = "ola";
        c1.wake(2);
        System.out.println(c1.name);
    }

}

class cab {
    String name;

    void wake(int a){
        int b = a;
        System.out.println("waking ==>> " + b);
    }
}


