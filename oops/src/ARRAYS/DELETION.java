package ARRAYS;
import java.util.*;
public class DELETION {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {10,21,32,43,54};
		int n = arr.length;
		System.out.print("Enter your position to delete:");
		int pos = sc.nextInt();
		for(int i = pos; i < n-1; i++) {
			arr[i] = arr[i+1];
		}
       n--;
       for(int i = 0; i < n; i++) {
    	   System.out.print(arr[i]+" ");
       }


		}
	}
