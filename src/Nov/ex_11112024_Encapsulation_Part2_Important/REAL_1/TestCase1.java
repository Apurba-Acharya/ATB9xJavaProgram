package Nov.ex_11112024_Encapsulation_Part2_Important.REAL_1;

public class TestCase1 extends BaseClass { //Child class; Inharitance

    public TestCase1 (){ //Default constructor
        super(); //Super is used to call Parent default constructor
        System.out.println("DC-TC1");
    }

    public void startTestcase (){
        openBrowser();
        closeBrowser();
        openBrowser("firefox");
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own logic: " + browser);
        super.setBrowser(browser, isAuth);
    }
}
