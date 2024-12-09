package Nov.ex_08112024Polymorphism.over_loading;

public class Practice_1 {
    public static void main(String[] args) {
        sd d = new sd();
        int result = d.add3(2, 3);
        System.out.println(result);
    }

}
class sd {
    int add3 (int a , int b){
        return a+b;
    }

}