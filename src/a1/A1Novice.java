package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int customer = scan.nextInt();
		// number of customers
		int[] values = new int[customer];
		
		var firstname = scan.next();
		var lastname = scan.next();
		int items = scan.nextInt();
		
		for (int i=0; i<items; i++) {
			values[i] = scan.nextInt();
		}
		
		scan.close();
		
		
		int sum = calculateValueSum(values);

		System.out.println(firstname + ". " + lastname.charAt(0) + ": " + sum);

	
	}	
static int calculateValueSum(int[] vals) {
		
		int sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
}
