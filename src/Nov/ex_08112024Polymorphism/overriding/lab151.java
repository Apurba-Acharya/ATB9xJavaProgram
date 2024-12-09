package Nov.ex_08112024Polymorphism.overriding;

import Nov.ex_07112024Inharitance.ex1.Father;

public class lab151 {
    public static void main(String[] args) {
        krishna k1 = new krishna();
        k1.home();

        father f1 = new krishna();
        f1.home();
    }
}

class father{
    void home (){
        System.out.println("home");
    }
}

class krishna extends father {
    @Override
    void home (){
        System.out.println("3BHK");
    }
}
