package Task;

public class task000 {
    public static void main(String[] args) {
        child c1 = new child();
        int e = c1.add(5,10, 11, 12);
        System.out.println(e);

        child c2 = new child();
        float m = c2.add(1.1f,0.2f);
        System.out.println(m);

    }


}

class child {
    int add (int a , int b){
        return a + b;
    }

    float add ( float a , float b){
        return a + b;
    }
    int add (int a , int b , int c , int d){
        return a + b + c + d;
    }
}

