package Nov.ex_19112024_Gnerics_WhyCollectationsFramework;

public class Practice_1 {
    private String a;
    private Integer b;

    public Practice_1(String a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
    public void P1 (){
        System.out.println(this.a);
        System.out.println(this.b);
    }

}
