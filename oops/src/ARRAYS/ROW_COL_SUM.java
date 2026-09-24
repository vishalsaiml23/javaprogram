package ARRAYS;
import  java.util.*;
public class ROW_COL_SUM {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
			int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
			System.out.println("---row---");
			
            for(int i = 0; i < a.length; i++) {
            	int sum = 0;
            	for(int j = 0; j < a[i].length; j++) {
            		sum += a[i][j];
            	}
            	System.out.println(sum);
            }
   
            System.out.println("---coloumn---");
            for(int i = 0; i < a.length; i++) {
            	int sumr = 0;
            	for(int j = 0; j < a[i].length; j++) {
            		sumr += a[j][i];
            	}
            	System.out.println(sumr);
            }
            System.out.print("Enter a particular row: ");
            int r = sc.nextInt();
            System.out.println("---row---");
           
            	int sumr = 0;
            	for(int j = 0; j < a[r].length; j++) {
            		sumr += a[j][r];
            	}
            	System.out.println(sumr);
            	
            	  System.out.print("Enter a particular row: ");
                  int c = sc.nextInt();
                  System.out.println("---column---");
                 
                  	int sumc = 0;
                  	for(int j = 0; j < a[c].length; j++) {
                  		sumr += a[c][j];
                  	}
                  	System.out.println(sumc);
            }
}
