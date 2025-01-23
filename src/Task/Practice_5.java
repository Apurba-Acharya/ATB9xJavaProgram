package Task;

import java.util.Scanner;

public class Practice_5 {

    /* Write a program that calculates and displays the letter grade
    for a given numerical score (e.g., A, B, C, D, or F) based on
    the following grading scale: */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();
        String grade;
        //char grade;
        if (score>=90 && score<=100) {
            grade = "A";
            //grade = 'A';
        }else if (score>=70 && score<=89){
            grade = "B";
            //grade = 'B';
        }else if (score>=40 && score<=69){
            grade = "C";
            //grade = 'C';
        }else if (score>9 && score<=39){
            grade = "D";
            //grade = 'C';
        }else {
            grade = "Fail";
            //grade = 'Fail';
        }
        System.out.println("Your grade is: " + grade);
        
    }
}
