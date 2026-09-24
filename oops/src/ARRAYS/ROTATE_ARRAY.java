//Left Rotate  

package ARRAYS;
import java.util.*; 
public class ROTATE_ARRAY {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print(" Enter Array Size : ");
	  int n = sc.nextInt();
	  int arr[] = new int[n];
	   
	  System.out.println(" Enter Array Element : ");
	  for(int i = 0 ; i < arr.length ; i++) {
		  arr[i] = sc.nextInt();
	  }
	  System.out.print(" Enter Rotate Position : ");
	  int k = sc.nextInt();
	  k = k % n ;
	  
	  reverse (arr , 0 , k-1);
	  reverse (arr , k , n-1);
	  reverse (arr , 0 , n-1);
	  
	  System.out.println("------After Left Rotation----- ");
	 for (int i = 0 ; i < n ; i++) {
		 System.out.print(arr[i] +" ");
	 }
     
	  
  }
	  static void reverse ( int [] arr, int Start, int End) {
		  while (Start < End) {
			  int temp = arr[Start];
			  arr[Start] = arr[End];
			  arr[End] = temp;
			  Start++;
			  End--;
		  }
  }
}
