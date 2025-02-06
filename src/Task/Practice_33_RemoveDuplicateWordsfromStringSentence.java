package Task;


import java.io.FilterOutputStream;
import java.util.*;

public class Practice_33_RemoveDuplicateWordsfromStringSentence {

    //Remove duplicate words from given sentence in string

    public static void main(String[] args) {
        String input = "I am am rahul rahul";

        String inputArr[] = input.split(" ");
        Set <String> myset = new LinkedHashSet<>(); //LinkedHashSet: It can maintain order and not accept duplicate value

        for (int i = 0; i < inputArr.length; i++) {
            if (myset.add(inputArr[i]) == true){
                //myset.add(inputArr[i]): return : boolean
                //myset.add(inputArr[i]) = true: perticular element is not already present in myset
                //myset.add(inputArr[i]) = false: perticular element is already present in myset
                //SOUT will be initial when: myset.add(inputArr[i]) = true == true;
                System.out.print(inputArr[i] + " ");
            }
        }

        System.out.println();

        // Using iterator:
        for (String word : inputArr){
            myset.add(word);
        }
        Iterator itr = myset.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
    }
}