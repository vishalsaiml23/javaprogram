package ARRAYS;
import java.util.*;
public class INSERT_PESIFIC_POSITION {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		// System.out.print("Enter array size:");
		// int n=sc.nextInt();
		 //int arr[]=new int[n];
		 
		 //for(int i=0;i<n;i++) {
			// arr[i]=sc.nextInt();
		 //} 
		
			//System.out.print(Arrays.toString(arr));

			
			//insert
			int arr1[] = {5,8,10,12};
			int k = 3;
			int pos = 0;
			int n = arr1.length;
			int ans[] = new int[n+1];
			System.out.println(Arrays.toString(ans));
			ans[pos] = k;
			for(int i = 0; i < n; i++) {
			  ans[i+1] = arr1[i];
			}
			System.out.print(Arrays.toString(ans));
	 }
}
