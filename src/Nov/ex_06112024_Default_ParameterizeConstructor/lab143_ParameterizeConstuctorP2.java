package Nov.ex_06112024_Default_ParameterizeConstructor;

import java.util.Scanner;

public class lab143_ParameterizeConstuctorP2 { //Runner class
    public static void main(String[] args) {
        //Parameterized Constructor objects >>>
        Scanner sc = new Scanner(System.in);

        car2 t1 = new car2("tata");
        System.out.println("*****Model1 Name: " + t1.model);
        //System.out.println(t1.year);
        t1.display2();

        car2 t2 = new car2("nano",1250);
        System.out.println("*****Model2 Name with Year: " + t2.model + " " + t2.year);
        t2.display1();

        System.out.print("Enter the model name: ");
        String model_name1 = sc.next();
        System.out.print("Enter the year: ");
        int year_create2 = sc.nextInt();
        car2 t3 = new car2(model_name1,year_create2);
        System.out.println("*****Model3 Name with Year: " + t3.model + " " + t3.year);
        t3.display1();

        //Default Constructor object >>>
        car2 honda = new car2();
        System.out.println("******" + honda.model + " > Manufactured year > " + honda.year);
        honda.display1();
    }

}
class car2 {   //Class

    //Atributes >>>
    String model;
    int year;

    //Parametrised Constructors type 1 >>>
    car2(String model_name,int year_create){
        System.out.println("PC1");
        this.model = model_name;
        this.year = year_create;
    }

    //Parametrised Constructors type 2 >>>
    car2(String model_name){
        System.out.println("PC2");
        this.model = model_name;
    }

    //Default constructor >>>
    car2 (){
        model = "Honda";
        year = 2000;
        System.out.println("DC is executed: ");
    }

    //Behaviours >>>
    void display1(){
        System.out.println("Car2 deatils -> " + this.model + " " + this.year);
    }
    void display2(){
        System.out.println("Car2 deatils -> " + this.model);
    }

}