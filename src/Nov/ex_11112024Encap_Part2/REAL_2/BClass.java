package Nov.ex_11112024Encap_Part2.REAL_2;

public class BClass {
    private String chrome;

    BClass(){
        System.out.println("DC --->>BClass");
    }
    BClass (String c){
        System.out.println("CC --->>>BClass");
    }

    public String getChrome() {
        return chrome;
    }

    public void setChrome(String chrome , boolean isauth) {
        if (isauth){
            this.chrome = chrome;
        }else{
            System.out.println("no access");
        }
    }

    void opbrowser (){
        System.out.println("Open browser --->>>");
    }
    void opbrowser(String op){
        System.out.println("closing browser ---->>>" + op);
    }

    void clbrowser(String cb ){
        System.out.println("closing browser ---->>>" + cb);
    }
}


