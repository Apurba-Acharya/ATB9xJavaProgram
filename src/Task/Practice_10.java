package Task;

public class Practice_10 {

    /* Remove Junk/Special Chars in a String */

    public static void main(String[] args) {
        String s1  = "#$%^& lotin String 98453";
        String s2 = "2345Selenium098765 learning 0987@#$%";

        s1 = s1.replaceAll("[^a-z A-Z 0-9]", "");
        s2 = s2.replaceAll("[a-zA-Z0-9]", "");

        System.out.println(s1);
        System.out.println(s2);
        }
    }
