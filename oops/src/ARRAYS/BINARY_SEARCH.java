package ARRAYS;
import java.util.*; 
public class BINARY_SEARCH {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter array size:");
		 int n = sc.nextInt();
		 int arr[] = new int[n];
		 System.out.println("Enter sotered array");
		 for(int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
			 
		 }
			System.out.print("Enter key value:");
			int key = sc.nextInt();
		    int low = 0;
			 int high = n-1;
			 while(low <= high) {
				 int mid = (low+high) / 2;
				 if(arr[mid] == key) {
					 System.out.print(mid);
					 return;
				 }else if(arr[mid] > key) {
					 high = mid-1;
				 }else {
					 low = mid+1;
				 
				 }
			 }
			 System.out.print(-1);
			 return;
		 }
}
