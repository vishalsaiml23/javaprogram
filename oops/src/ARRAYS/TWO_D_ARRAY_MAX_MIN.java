package ARRAYS;
import java.util.*;
public class TWO_D_ARRAY_MAX_MIN {
	 public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           System.out.print("Enter Array Row : ");
           int r = sc.nextInt();
           
           System.out.print("Enter Array Coloumn : ");
           int c = sc.nextInt();
		 
		  int [][] arr = new int[r][c];
		  System.out.println(" Enter Array Element : ");
		  for(int i = 0 ; i < r ; i++) {
			  for (int j = 0; j < c; j++) {
			  arr[i][j] = sc.nextInt();
		  }
		  }
		  
		  int max = arr[0][0];
		  int min = arr[0][0];
		  for (int i = 0; i < r; i++) {
			  for (int j = 0; j < c; j++) {
			  if(arr[i][j] > max) {
				  max = arr[i][j];
				  }
			  else if(arr[i][j] < min) {
				  min = arr[i][j];
			  }else
				  continue;
			  }
		  }
		System.out.println("Maximum Element in the Array: "+max);
		System.out.println("Manimum Element in the Array: "+min);  
	  }
}
