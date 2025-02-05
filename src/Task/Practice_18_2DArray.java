package Task;

public class Practice_18_2DArray {
    public static void main(String[] args) {
        int arr[][]  = { { 2, 7, 9 }, { 11, 12, 13 }, { 14, 15, 16 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr [i] [j]+ " ");

            }
            System.out.println();
        }
    }
}
