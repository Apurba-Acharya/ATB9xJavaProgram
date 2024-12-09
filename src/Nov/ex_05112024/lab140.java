package Nov.ex_05112024;

public class lab140 {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.name = "oosodo";
        c1.sleep();
        System.out.println(c1.name);

    }
}

class cat{
    String name;

    void sleep(){
        System.out.println("sleeping ->> " + name);
    }
}
