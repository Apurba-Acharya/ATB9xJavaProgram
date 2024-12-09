package Nov.ex_06112024_Default_ParameterizeConstructor;

import java.util.Scanner;

public class lab143_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dog d2 = new dog("kneww", 50);
        System.out.println(d2.age);
        System.out.println(d2.name);

        d2.display();

        String name1 = sc.next();
        int age1 = sc.nextInt();
        dog d3 = new dog(name1,age1);
        System.out.println(d3.age);
        System.out.println(d3.name);

        d3.display();


    }

}

class dog{
    String name;
    int age;

    dog(String name_1, int age_2){
        this.name = name_1;
        this.age = age_2;
    }
    void display(){
        System.out.println("hcbbcsbk --->>"+this.name+this.age);
    }
}
