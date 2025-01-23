package Nov.ex_21112024_ListSetCollectionFramework;

public class lab211_Student {
        private String name;
        private Integer rollNo;

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public lab211_Student(Integer rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;

    }
    public void print (){
        System.out.println("Student Name ->" + this.name);
        System.out.println("Student RollN ->" + this.rollNo);
    }
}
