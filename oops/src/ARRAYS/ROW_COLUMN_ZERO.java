
package ARRAYS;

import java.util.*;

public class ROW_COLUMN_ZERO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row Size: ");
        int p = sc.nextInt();

        System.out.print("Enter Column Size: ");
        int r = sc.nextInt();

        // Get array input from user
        System.out.println("Enter Array Elements:");
        int[][] arr = new int[p][r];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Store the rows and columns containing zeros
        int[] row = new int[p];
        int[] col = new int[r];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Make rows and columns zero
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print the array
        System.out.println("Output:");

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}