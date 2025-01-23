package Task;

import java.util.Scanner;

public class Practice_7 {

    /* Write a program that classifies a triangle based on its side lengths.
    Given three input values representing the lengths of the sides,
    determine if the triangle is equilateral (all sides are equal), isosceles
    (exactly two sides are equal), or scalene (no sides are equal).
    Use an if-else statement to classify the triangle. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c value 5: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && b==c){
            System.out.println("Traiangle is: Equilateral");
        }else if (a==b || b==c || c==a){
            System.out.println("Traiangle is: Isoscale");
        }else {
            System.out.println("Traiangle is: Scalene");
        }
    }
}
