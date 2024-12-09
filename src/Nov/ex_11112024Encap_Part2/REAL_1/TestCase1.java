package Nov.ex_11112024Encap_Part2.REAL_1;

public class TestCase1 extends BaseClass {

    public TestCase1 (){
        super(); //means parents
        System.out.println("DC-TC1");
    }

    public void startTestcase (){
        openBrowser();
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own logic");
        super.setBrowser(browser, isAuth);
    }
}
