package Nov.ex_11112024Encap_Part2.REAL_1;

public class BaseClass {

   private String browser;

   BaseClass(){
       System.out.println("DC -> BaseClass");
   }
    BaseClass(String b){
        System.out.println("CC -> BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser , boolean isAuth) {
        if (isAuth){
            this.browser = browser;
        }else{
            System.out.println("Not access");
        }
    }

    void openBrowser(){
        System.out.println("Opening Brow...");
    }
    void openBrowser (String browserName) {
        System.out.println("Open Browser ... ->>" + browserName);
    }
    void closeBrowser(){
        System.out.println("Closing Brow...");
    }
}
