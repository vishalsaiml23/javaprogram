package ARRAYS;
import java.util.*;
public class TRANSPOSE_ARRAY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Row Size : ");
		 int row = sc.nextInt();
		 
		 System.out.print("Enter Column Size : ");
		 int column = sc.nextInt();
		 
		 //Get Array Input From User
		 
		 int arr [][] = new int[row][column];
		 for(int i = 0; i < row; i++) {
			 for(int j = 0; j < column; j++) {
			 arr[i][j] = sc.nextInt();
		 }
		 }
		 
		 // Transpose the 2x2 matrix
		 
		 System.out.println("=====After Transpose The Array=====");
		 
		 for(int i = 0; i < row; i++) {
			 for(int j = 0; j < column; j++) {
				 System.out.print(arr[j][i] +" ");
				 
			 }
			 System.out.println();
		 }
		 
			 }
}
