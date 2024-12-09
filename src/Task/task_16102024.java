package Task;

import java.util.Scanner;

public class task_16102024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name\n");
        String name = scanner.next();
        System.out.println("Enter age\n");
        int age = scanner.nextInt();
        System.out.println("Enter salary\n");
        int salary = scanner.nextInt();
        System.out.println(age);
        System.out.println(salary);
        System.out.println(name);
        scanner.close();
    }
}
