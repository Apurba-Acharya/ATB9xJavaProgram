package Task;

import java.util.Scanner;

public class Practice_18 {
    public static void main(String[] args) {
        int arr[][]  = { { 2, 7, 9 }, { 11, 12, 13 }, { 14, 15, 16 } };
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr [i] [j]+ " ");

            }
            System.out.println();
        }
    }
}
