package Nov.ex_07112024Inharitance.ex2;

public class Python extends Program {


    void print (){
        System.out.println(auth);
        System.out.println(version);

    }

    Python(){            //***
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.auth);
    }
}