package Task;

public class Practice_17_findDuplicateStringfromArray {

    /* How to Find Duplicates Elements in Java Array? */

    public static void main(String[] args) {
        String names[] = {"c", "Java", "Ruby", "Paython", "Java", "c"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("duplicate element is: " + names[i]);
                }
            }
        }
    }
}
