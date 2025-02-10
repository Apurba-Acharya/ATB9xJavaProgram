package Task;

import java.util.HashSet;
import java.util.Set;

public class Practice_12_MissingNumberFromArray_Imp {

    /* How to find Missing Number In Array */

    // Logic = (1+2+3+4+5) = 15 - (1+2+4+5) = 13 > Missing number: 15-12 = 3

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};

        int total = 0;
        for (int num : a) {
            total += num; //total = total + num;
        }
        System.out.println(total);
        int total1 = 0;
        for (int j = 0; j <= 5; j++) {
            total1 += j;
        }
        System.out.println(total1);
        System.out.println("missing number: " + (total1 - total));


        // Using [n * (n+1) / 2] formula:
        int n = 5; //last number of the given array.
        int actual1 = n * (n + 1) / 2;
        int expected1 = 0;
        for (int b : a) {
            expected1 = expected1 + b;
        }
        System.out.println("Using formula: " + (actual1 - expected1));


        //Using HashSet (Important):
        int b[] = {1, 2, 4, 5, 7};
//        int c = 7; //last number of the given array.
        Set<Integer> hs = new HashSet<>();
        for (int d : b) {
            hs.add(d); // return boolean; //Adding all integer value in the "hs"
        }
        for (int i = 1; i <= 7; i++) {
            if (hs.contains(i) == false) {
                //hs.contains(i) == false : Compairing which "i" values is not present in "hs"
                //hs.contains(i) == true : Compairing which "i" values is present in "hs"
                System.out.println("Using HashSet: " + i);
            }
        }
    }
}
