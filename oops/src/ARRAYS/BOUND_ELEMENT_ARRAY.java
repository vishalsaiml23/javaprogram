package ARRAYS;
import java.util.*;
public class BOUND_ELEMENT_ARRAY {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Row Size : ");
		int p = sc.nextInt();
		
		System.out.print("Enter Column Size : ");
		int r = sc.nextInt();
		
		// Get Input From User
		System.out.println("Enter Array Elements : ");
		int [][]a= new int [p] [r];
		for(int i = 0; i < p; i++) {
			for(int j = 0; j < r; j++) {
				a[i][j] = sc.nextInt();	
			}
		}
		
		// Lower Bound Element 
		System.out.println("Lower Bound Elements :");
		for(int i = 0; i < p; i++) {
			for(int j = 0; j < r; j++) {	
				if(i>=j) {
					System.out.print( a [i] [j] + " ");
				}
				
			}
			System.out.println();
		}	
		
		// Upper Bound Element
		System.out.println("Upper Bound Elements :");
		for(int i = 0; i < p; i++) {
			for(int j = 0; j < r; j++) {	
				if(i<=j) {
					System.out.print( a [i] [j] + " ");
				}
				
			}
			System.out.println();
		}	
	}
}

