package Nov.ex_07112024Inharitance.ex3;

public class TC2 extends comm_BaseTest{
    public TC2() {
        System.out.println("DC-child");
    }
    //TC1(){
    //System.out.println("DC-child");
    void testcase2(){
        sBrowser();
        System.out.println("EXECUTING");
        cBrowser();
        rBrowser();
    }
}
