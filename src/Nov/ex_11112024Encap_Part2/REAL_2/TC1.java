package Nov.ex_11112024Encap_Part2.REAL_2;

public class TC1 extends BClass {
    public TC1(){
        System.out.println("DC -->>TC1");
    }

    public void startTC(){
        opbrowser();
        clbrowser("please close");
    }

    @Override
    public void setChrome(String chrome, boolean isauth) {
        System.out.println("Own logic");
        super.setChrome(chrome, isauth);
    }
}
