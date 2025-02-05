package Task;

import java.util.HashMap;
import java.util.Map;

public class Practice_24_OccuranceofWordInAString {
//    Occurance of Word In A String

    public static void main(String[] args) {
        String str = "I am learning learning java java programming";

        String [] words = str.split(" ");
        Map <String, Integer> wordCount = new HashMap<>();
        for (String word : words){
            if (wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word) + 1);
            }else {
                wordCount.put(word, 1);
            }
        }
            for (String x : wordCount.keySet()){
                System.out.println("Count: " + x + " = " + wordCount.get(x));
            }
    }
}
