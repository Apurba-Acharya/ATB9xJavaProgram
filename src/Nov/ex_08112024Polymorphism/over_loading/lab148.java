package Nov.ex_08112024Polymorphism.over_loading;

public class lab148 {
    public static void main(String[] args) {
        mpr m = new mpr();
       int result =  m.add (5,4, 9);
        System.out.println(result);
    }
}

class mpr {
    int add (int a, int b){
        return a+b;
    }

    float add (float a, float b) {
        return a + b;
    }
    int add (int a, int b, int c){
        return a + b + c;
    }
}
