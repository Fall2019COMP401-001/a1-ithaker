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
			double[] checkout = new double[items];
		
			for (int j=0; j<checkout.length; j++) {
				int quant = scan.nextInt();
				var food = scan.next();
				double price = scan.nextDouble() + 0.00;
				checkout[j] = (quant * price) + 0.00;
		}
						
		double sum = calculateValueSum (checkout);

		System.out.print(firstname.charAt(0) + ". " + lastname + ": ");
		System.out.printf("%.2f\n", sum);

		}
		scan.close();
	}	
static double calculateValueSum(double[] vals) {
		
		double sum = 0.00;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum + 0.00;
	}
}
