package Nov.ex_06112024_Default_ParameterizeConstructor;

public class lab141_Constructor {
    public static void main(String[] args) {
        car c1 = new car();
        System.out.println(c1.name + c1.year + " " + c1.model);

        car nano = new car();
        nano.name = "maruti";
        nano.model = "D22";
        nano.year = 2000;
        System.out.println(nano.model);
    }



}


