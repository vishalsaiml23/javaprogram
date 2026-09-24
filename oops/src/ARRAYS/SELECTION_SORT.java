package ARRAYS;
import  java.util.*;
public class SELECTION_SORT {
	 public static void main(String[] ags) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Array Length:");
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for (int i = 0; i < n; i++) {
			  arr[i] = sc.nextInt();
		  }
		  System.out.println(Arrays.toString(arr));
		  for(int i = 0; i < n; i++) {
			  int min = i;
			 for(int j = i+1; j < n; j++) {
				 if(arr[j] < arr[min]) {
					 min = j;
				 }
			 }
				    int temp = arr[min];
				    arr[min] = arr[i];
			        arr[i] = temp;
			  
			  
		  }
		  System.out.println("-----After Slection Sorting-----");
		  for(int i = 0; i < n; i++) {
			  System.out.print(arr[i]+" ");
		  }
	  }
}
