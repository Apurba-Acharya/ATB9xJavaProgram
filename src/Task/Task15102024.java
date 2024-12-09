package Task;

public class Task15102024 {
    public static void main(String[] args) {
        //find the maximum of two  number
        int x = 10;
        int y = 20;
        //rough logic x > y >> x:y
        int max = x>y ? x:y;
        System.out.println(max);

        //find the maximum number a,b,c using ternary operator
        int a = 10;
        int b = 1;
        int c =90;
        int g = a > b ? a : b;
        int f = g > c ? g : c;
        System.out.println(f);
    }
}
