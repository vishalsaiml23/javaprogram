package CONDITION;
import java.util.*;
public class TRAFIC_SIGNAL {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the signal colour :");
		  char colour = sc.next().charAt(0);
		 switch(colour) {
		 case 'R','r':
			 System.out.print("Stop");
		     break;
		 case 'Y','y':
			 System.out.print("Ready");
		     break;
		 case 'G','g':
			 System.out.print("Go");
		     break;
		 default:
			 System.out.print("Invalid Singnal");
		 }
		 }
}
