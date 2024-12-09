package Nov.ex_06112024_Default_ParameterizeConstructor;

import java.util.Scanner;

public class lab143_ConstuctorP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        car2 t1 = new car2("tata1");
        System.out.println(t1.model);
        System.out.println(t1.year);

        t1.display();

        car2 t2 = new car2("tata2",1250);
        System.out.println(t2.model);
        //System.out.println(t2.year);

        t2.display();

        String model_name1 = sc.next();
        int year_create2 = sc.nextInt();
        car2 c3 = new car2(model_name1,year_create2);
        System.out.println(c3.year);
        System.out.println(c3.model);


    }

}


class car2 {
    String model;
    int year;

    car2(String model_name,int year_create){
        System.out.println("PC");
        this.model = model_name;
        this.year = year_create;
    }
    car2(String model_name){
        System.out.println("PC");
        this.model = model_name;
    }
    void display(){
        System.out.println("car2 deatils -> " + this.model + this.year);
    }

}