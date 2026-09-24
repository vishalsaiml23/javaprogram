package ARRAYS;
import java.util.*;
public class LEETCODE_11 {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter length of an Array:");
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  int l = 0;
		  int r = n-1;
		  int maximum = 0;
		  for(int i = 0; i < n; i++) {
			  arr[i] = sc.nextInt();
		  }
		  while(l < r) {
			  int h = Math.min(arr[l],arr[ r]);
			  int w = r-l;
			  int area = h*w;
		      maximum=Math.max(maximum, area);
		      if(arr[l] < arr[r]) {
		    	  l++;
		      }else {
		    	  r--;
		      }
		     
		  }
		  System.out.print(maximum);
		}
}
