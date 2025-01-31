package Task;

import java.util.HashSet;
import java.util.Set;

public class Practice_21_StringManipulationinJava {

    /* String Manipulation in Java */

    public static void main(String[] args) {
        String str = "The rains have started here selenium";
        System.out.println(str.length());

        System.out.println(str.charAt(5)); //Important

        System.out.println(str.indexOf('s')); //1st occurance of s

        System.out.println(str.indexOf('s', str.indexOf('s')+1)); // 2st occurance of s

        System.out.println(str.indexOf("have")); //Index of word

        System.out.println(str.indexOf("hello")); //If any word is not available then it should display -1

        String str2 = "The rains have started here selenium";
        System.out.println(str==str2); //String compairison
        System.out.println(str.equals(str2)); //String compairison

        String str3 = "The rains have started here SElenium";
        System.out.println(str.equalsIgnoreCase(str3));

        System.out.println(str.substring(0,9)); //Substring

        //trim
        String s = "         hello World     ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));

        //replace
        String s1  = "01-01-2017";
        System.out.println(s1.replace("-","/"));

        //Split:
        String test = "Hello_World_Test_Selenium";
       String testVal [] = test.split("_");
        for (int i = 0; i < testVal.length; i++) {
            System.out.print(testVal[i]);
            System.out.print(" ");
        }

        //String Concatenation:
        String s2 = "cares";
        System.out.println(s2.concat("AA"));


        //Important:
        String x  = "hello";
        String y  = "World";
        int a = 100;
        int b = 200;
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
        System.out.println(x+y+(a+b));
    }
}
