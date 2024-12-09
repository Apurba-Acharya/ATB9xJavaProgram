package Nov.ex_08112024Polymorphism.overriding;

public class lab150_overriding {
    public static void main(String[] args) {
        hound h1 = new hound();
        h1.bark();
    }
}

class dog {
    void bark(){
        System.out.println("can bark");
    }
    int age = 10;
}
class hound extends dog{
   @Override
    void bark(){
        System.out.println("can be bark");
    }
}
