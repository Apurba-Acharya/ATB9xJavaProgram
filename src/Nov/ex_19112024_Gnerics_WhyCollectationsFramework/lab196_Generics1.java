package Nov.ex_19112024_Gnerics_WhyCollectationsFramework;

public class lab196_Generics1 {
    public static void main(String[] args) {
        temp(12, 45);
        temp("pramo","dutta");
        temp(true, false);

    }

    public static <T> T temp (T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
//    public static String temp (String a, String b){
//        return a+b;
//    }
}
