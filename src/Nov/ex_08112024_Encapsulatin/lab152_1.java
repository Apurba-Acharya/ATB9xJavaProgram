package Nov.ex_08112024_Encapsulatin;

import java.sql.SQLOutput;

public class lab152_1 {
    public static void main(String[] args) {
        Human obj = new Human();
        int a = obj.getAge();
        String b = obj.getName();
        System.out.println(a + "->" + b);

        obj.setAge(30);
        obj.setName("noob");
        System.out.println(obj.getAge() + " " + obj.getName());
    }
}

class Human {
    private int age = 11;
    private String name = "djj";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int a){
//        age = a;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
}