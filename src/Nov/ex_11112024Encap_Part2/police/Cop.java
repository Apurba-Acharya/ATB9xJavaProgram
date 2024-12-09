package Nov.ex_11112024Encap_Part2.police;

public class Cop {

    private int gun;
    public String icard = "125685";

    public Cop (int gun){
        this.gun = gun;
    }
    protected void canIshoot(){
        System.out.println("Yes you can!!");
    }

}

