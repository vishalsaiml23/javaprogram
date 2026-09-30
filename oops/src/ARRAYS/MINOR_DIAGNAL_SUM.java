package ARRAYS;
import java.util.*;
public class MINOR_DIAGNAL_SUM {
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
		 
		 // Main Diagnal Element Sum
		 int sum = 0;
		 for(int i = 0; i < row; i++) {
			 sum += arr[i][i];
		 }
		 System.out.println("Main Diagnal Element Sum : " + sum);
	}
		
}
