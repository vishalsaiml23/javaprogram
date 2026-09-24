package ARRAYS;
import java.util.*;
public class AVG_TEMPRATURE {
 public static void main(String[] args) {
	 Scanner  sc = new Scanner (System.in);
	  
	 System.out.println(" Enter Array Size : ");
	 int n = sc.nextInt();
	 
	 int count = 0;
	 double avg = 0;
	 double total = 0;
	 
	 double [] tempra = new double[n];
	 System.out.println("Enter Every Day Temperature : ");
	 
	 for(int i = 0; i < n; i++) {
		 tempra [i] = sc.nextDouble();
	 }
	 
	 for (int i = 0; i < n; i++) {
		  total = total + tempra[i]; 
	 }
	 avg = total / n;
	 
	 for (int i = 0; i < n; i++) {
		 if(tempra[i] > avg) {
			 count++;
		 }
	 }
	 
	 System.out.println(" Average Temperature : " + avg);
	 System.out.println(" Days That Above The Average : " + count);
 }
}
