package Task;

public class Practice_30_ReverseEveryWordInSentence {

//    reverse each [every] word in sentence, position should be same

    public static void main(String[] args) {
        String str = "We are learning java";
        //Answer: eW era gninrael avaj

        String result = "";
        String arr[] = str.split(" "); //Split the sentence and store the sentence based on the space
        for (String word : arr) {

            String reverseword = "";
            int j = word.length() - 1;
            while (j >= 0) {
                char ch = word.charAt(j);
                reverseword = reverseword + ch;
                j--;
            }
            result = result + reverseword + " ";
        }
        System.out.println(result);
    }
}
