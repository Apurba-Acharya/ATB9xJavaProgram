package Nov.ex_06112024_Default_ParameterizeConstructor;

import java.util.Scanner;

public class lab143_ParameterizeConstuctorP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bus b1 = new bus("panth", 4);
        System.out.println(b1.driver);
        System.out.println(b1.wheel);
        b1.display();

        String driver_d1 = sc.next();
        int wheel_w1 = sc.nextInt();
        bus b2 = new bus (driver_d1 , wheel_w1);
        System.out.println(b2.driver);
        System.out.println(b2.wheel);
        b2.display();
    }


}

class bus {
    int wheel;
    String driver;

    bus(String driver_d,int wheel_w){
        System.out.println("wheel-1");
        this.wheel = wheel_w;
        this.driver = driver_d;
    }
    void display(){
        System.out.println("dissplay name ->" + this.wheel + this.driver);
    }
}
