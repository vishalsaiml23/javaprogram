package ARRAYS;
import java.util.*;
public class SECOND_SMALLEST {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Array Size : ");
	 int n = sc.nextInt();
	 int [] a = new  int [n];
	 
	 System.out.println("Enter Array Element : ");
	 for(int i = 0; i < n; i++) {
		 a[i] = sc.nextInt();
	 }
	 int min = a[n-1];
	 int sec_mini = 0;
	 Arrays.sort(a);
	 for(int i = n-2; i >= 0; i--) {
		 if(a[i] != min) {
			 sec_mini = a[i];
		 }
	 }
	 System.out.println(" Second Smallest Element : "+ sec_mini);
 }
}
