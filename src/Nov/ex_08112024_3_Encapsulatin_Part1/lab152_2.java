package Nov.ex_08112024_3_Encapsulatin_Part1;

public class lab152_2 {
    public static void main(String[] args) {
        marks obj = new marks();
        int a = obj.getAge();
        String b = obj.getName();
        System.out.println(a+ " "+b);

        obj.setAge(91);
        obj.setName("noob2");
        System.out.println(obj.getAge() + " " + obj.getName());

    }
}

class marks {
   private int age = 10;
   private String name = "noob1";

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
}
