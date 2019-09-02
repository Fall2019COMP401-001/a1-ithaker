package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int customer = scan.nextInt();
		// number of customers
		int[] values = new int[customer];
		
		for (int i=0; i<values.length; i++) {
			var firstname = scan.next();
			var lastname = scan.next();
			int items = scan.nextInt();
			int quant = scan.nextInt();
			var food = scan.next();
			int price = scan.nextInt();
					
			int[] checkout = new int[items];
		
			for (int j=0; j<items; j++) {
				checkout[j] = quant * price;
		}
					
		int sum = calculateValueSum(checkout);

		System.out.println(firstname.charAt(0) + ". " + lastname + ": " + sum);

		}
	}	
static int calculateValueSum(int[] vals) {
		
		int sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
}
