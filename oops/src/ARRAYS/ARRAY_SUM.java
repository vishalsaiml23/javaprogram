package ARRAYS;
import java.util.*;
public class ARRAY_SUM {
  public static void main(String[] args) {
	  int a [][] = {{10,20,30},{40,50,60}};
	  
	  int sum = 0;
	  
	  for (int i = 0; i < a.length; i++) {
		  for(int j = 0; j < a.length; j++) {
			  sum += a[i][j];
		  }
	  }
	  System.out.println(sum);
  }
	
}
