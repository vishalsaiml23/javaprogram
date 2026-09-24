package ARRAYS;
import  java.util.*;
public class BUBBLE_SORT {
	 public static void main(String[] args) {
		 int [] arr = {12,67,908,76,67,9,876};
		  for (int i = 0; i < arr.length-1; i++) {
			  for(int j = 0;j < arr.length-1-i; j++) {
				  if(arr [j] > arr[j+1]) {
					  int temp = arr[j];
					  arr[j] = arr[j+1];
					  arr[j+1] = temp;
				  }
			  }
			  System.out.println(Arrays.toString(arr));
		  }
	 }
}
