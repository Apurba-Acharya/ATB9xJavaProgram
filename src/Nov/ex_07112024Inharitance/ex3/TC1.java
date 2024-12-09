package Nov.ex_07112024Inharitance.ex3;

public class TC1 extends comm_BaseTest {
    public TC1() {
        System.out.println("DC-child");
    }
    //TC1(){
        //System.out.println("DC-child");
    void testcase1(){
        sBrowser();
        cBrowser();
        rBrowser();
    }
}
