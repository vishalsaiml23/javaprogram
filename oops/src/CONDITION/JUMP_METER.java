package CONDITION;
import java.util.*;
public class JUMP_METER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter K1 position:");
		int x1 = sc.nextInt();
	    System.out.println("Enter K2 position:");
	    int x2 = sc.nextInt();
	    System.out.println("Enter K1 jump meter:");
	    int v1 = sc.nextInt();
	    System.out.println("Enter K2 jump meter:");
	    int v2 = sc.nextInt();
	    if(x1 == x2){
	    	System.out.println("YES");
	    }else if((v1 > v2) && ((x2 - x1) % (v2 - v1)) == 0) {
	    	System.out.println("YES");
	    }else {
	    	System.out.println("NO");
	    }
	

}
}
