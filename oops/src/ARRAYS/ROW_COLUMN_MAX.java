package ARRAYS;
import java.util.*;
public class ROW_COLUMN_MAX {
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
	 
	 // Row Wise Maximum
	 
	for (int i = 0; i < row; i++) {
		int rmax = arr[i][0];
		for(int j = 1; j < arr[i].length; j++) {
			if(rmax < arr[i][j]) {
				rmax = arr[i][j];
			}
		}
		System.out.println("Row ["+(i+1) +"] Maximum : "+ rmax);
	}
	
	// Column wise Maximum Number
	
	for (int i = 0; i < row; i++) {
		int cmax = arr[0][i];
		for(int j = 1; j < arr[i].length; j++) {
			if(cmax < arr[j][i]) {
				cmax = arr[j][i];
			}
		}
		System.out.println("Column ["+(i+1) +"] Maximum : "+ cmax);
	}
 }
}
