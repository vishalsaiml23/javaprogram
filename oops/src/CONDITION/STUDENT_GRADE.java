package CONDITION;
import java.util.*;
public class STUDENT_GRADE {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter your Grade:");
		  char grade=sc.next().charAt(0);
		  switch(grade){
		  case 'A':
			  System.out.print("Excalent");
		      break;	  
		  case 'B','C':
			  System.out.print("Well Done");
		      break;
		  case 'D':
			  System.out.print("You Passed");
			  break;
		  case 'F':
			  System.out.print("Better Luck Next Time");
			  break;
			default:
				System.out.print("Invalid Grade");
		  }
	  }
}
