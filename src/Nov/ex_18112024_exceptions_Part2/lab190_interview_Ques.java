package Nov.ex_18112024_exceptions_Part2;

public class lab190_interview_Ques {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10/a;
        }catch (Exception e){
            System.out.println("div by zero");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I'll be executed any...");
        }
    }
}