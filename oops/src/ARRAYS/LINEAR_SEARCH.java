package ARRAYS;
import java.util.*;
public class LINEAR_SEARCH {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter array size:");
		 int n = sc.nextInt();
		 int arr[] = new int[n];
		 int index = -1;
		 for(int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.print("Enter key value:");
		 int key = sc.nextInt();
		 for(int i = 0; i < n; i++) {
			 if(arr[i] == key) {
				 index = i;
				 break;
			 }
		 }
	      System.out.print(index); 
		 
	}
}
