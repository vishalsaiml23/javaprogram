package METHOD;
import java.util.*;
public class PERFECT_NUMBER {
	static int factorial(int n) {
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact*i;
        }

        return fact;
    }
  static int sumOfFactors(int n) {
        int sum = 0;

        for(int i = 1; i < n; i++) {
            if(n%i == 0) {
                sum = sum+i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = sumOfFactors(n);

        if(sum == n) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }
    }
}
