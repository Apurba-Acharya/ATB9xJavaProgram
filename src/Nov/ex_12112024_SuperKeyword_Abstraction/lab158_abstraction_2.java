package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab158_abstraction_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();
    }
}

class Child extends Father {
    @Override
    void loan50k() {
        System.out.println("I'm paying -- > loan50k");
    }
}

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Done --> Father");
    }
}