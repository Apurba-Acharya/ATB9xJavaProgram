package Nov.ex_08112024_Encapsulatin;

public class lab152_Encap {
    public static void main(String[] args) {
        VMOLogin vmoLogin = new VMOLogin("admin" , "password123");
        System.out.println(vmoLogin.password);
        vmoLogin.password = "hacker";
        System.out.println(vmoLogin.password);

        GoodVMOLogin vmoLogin1 = new GoodVMOLogin("admin" , "password12");
//        System.out.println(vmoLogin1);

        String pass = vmoLogin1.getPassword(true);
        //vmoLogin1.setPassword("hacker123");
        System.out.println(pass);

    }

}

class VMOLogin {
    public String username;
    public String password;

    public VMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class GoodVMOLogin{
    private String username;
    private String password;

    public GoodVMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAdmin) {
        if (isAdmin){
            return password;
        }
        return "none";
    }

}
