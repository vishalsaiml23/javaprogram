package ARRAYS;
import java.util.*;
public class INSERTION_SORT {
	 public static void main(String[] ags) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Array Length:");
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for (int i = 0; i < n; i++) {
			  arr[i] = sc.nextInt();
		  }
		  System.out.println(Arrays.toString(arr));
		  
		  for(int i = 1; i < n; i++) {
			  int key = arr[i];
			  int j = i-1;
			  while(j >= 0 && arr[j] > key) {
				  arr[j+1] = arr[j]; 
				  j--;
			}
			  arr[j+1] = key;
   }
		  System.out.println("-----After Insertion Sorting-----");
		  for(int i = 0; i < n; i++) {
			  System.out.print(arr[i]+" ");
		  }	  
 }
}
