package ARRAYS;
import java.util.*;
public class SUM_EQUAL_TARGET {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Array Length:");
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for (int i = 0; i < n; i++) {
			  arr[i] = sc.nextInt();
		  }
		  System.out.println(Arrays.toString(arr));
		  
		  
	  }
}
