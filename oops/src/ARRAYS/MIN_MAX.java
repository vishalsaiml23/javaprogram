package ARRAYS;

public class MIN_MAX {
	  public static void main(String[] args) {
		  int [] arr = {24,89,45,67,47};
		  int max = arr[0];
		  int min = arr[0];
		  for (int i = 1; i < arr.length-1; i++) {
			  if(arr[i] > max) {
				  max = arr[i];
				  }
			  else if(arr[i] < min) {
				  min = arr[i];
			  }else
				  continue;
			  }
		System.out.println("Maximum Element in the Array: "+max);
		System.out.println("Manimum Element in the Array: "+min);  
	  }
}
