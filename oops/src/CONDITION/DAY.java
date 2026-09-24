package CONDITION;
import java.util.*;
public class DAY {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a day :");
		  String day = sc.nextLine();
		  switch(day) {
		 case "Monday":
		 case "Tuesday":
		 case "wednesday":
		 case "Thursday":
		 case "Friday":	 
			 System.out.print("Week Day");
		     break;
		 case "Saturday":
		 case "Sunday":
			 System.out.print("Week End");
		     break;
		
		 default:
			 System.out.print("Invalid Day");
		 }
		 }
}
