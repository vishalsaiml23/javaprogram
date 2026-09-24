package ACC_PROGRAM;
import java.util.*;
public class BILL_AMT {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter your Account Balance:");
		  int balance = sc.nextInt();
		  if(balance >= 10000) {
			  System.out.println("Premium Account:Withdrawal Allowed");
		  }else if(balance < 10000 && balance >= 1000) {
			  System.out.println("Withdrawal Allowed");
		  }else {
			  System.out.println("Insufficient Balance");
		  }
}
}
