package Task;

import javax.xml.transform.Result;
import java.util.Scanner;

public class task_18102024_2 {

    //Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n1");
        int n1 = sc.nextInt();

        System.out.println("n2");
        int n2 = sc.nextInt();

        System.out.println("ope");
        char ope = sc.next().charAt(0);

        int result;

        switch (ope){
            case '+':
            result = n1 + n2;
                System.out.println(result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println(result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println(result);
                break;
            case '/':
                if (n2!=0){
                    result = n1/n2;
                    System.out.println(result);
                }
                else {
                    System.out.println("incorrect number");
                }
        }
    }
}
