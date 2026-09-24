package ACC_PROGRAM;
import java.util.*;
public class BILL {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter your bill amount:");
		  int bill = sc.nextInt();
		  if(bill >= 10000) {
			  System.out.println("20% Discount");
		  }else if(bill < 10000 && bill >= 5000) {
			  System.out.println("10% Discount");
		  }else {
			  System.out.println("No Discount");
		  }
		  
	  }
}
