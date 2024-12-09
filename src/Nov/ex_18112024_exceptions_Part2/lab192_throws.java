package Nov.ex_18112024_exceptions_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab192_throws {
    public static void main(String[] args ) throws Exception {
        //Throws - Checked Exceptions
        FileInputStream fileInputStream = new FileInputStream("C://abc");
//        try {
//            FileInputStream fileInputStream = new FileInputStream("C://abc");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
