package ARRAYS;
import java.util.*;
public class TOW_POINTER_TECH {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter Array Length:");
	  int n = sc.nextInt();
	  int arr[] = new int[n];
	  for (int i = 0; i < n; i++) {
		  arr[i] = sc.nextInt();
	  }
	  System.out.println(Arrays.toString(arr));
	  
	  int low = 0;
	  int high = n-1;
	  while(high >= low) {
		  int temp = arr[low];
		    arr[low] = arr[high];
	        arr[high] = temp;
	        low = low+1;
	        high = high-1;
	  }
	  System.out.println("-----After Two Pointer tech-----");
	  for(int i = 0; i < n; i++) {
		  System.out.print(arr[i]+" ");
	  }	  
}
}
