package Task;
import java.util.HashSet;

    public class Q19_FirstRepeatedCharacterInStringSentence_R {
        public static void main(String[] args) {
            String input = "x progxamming nicoter";
            String n = input.replaceAll(" ", "");
            char c[] = n.toCharArray();
            HashSet<Character> seen = new HashSet<>();
            Character firstRepeated = null;

            for (char ch : c) {
                if (seen.add(ch)==false) {
                    firstRepeated = ch;
                    break;
                }
            }
            System.out.println("First repeated character: " + firstRepeated);
        }
    }
