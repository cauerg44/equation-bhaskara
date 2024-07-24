package equation;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for a, b and c: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		equation(a, b, c);
		
		sc.close();
	}
	
	public static void equation(int a, int b, int c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("The given equation has no real roots");
		}
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("Result x1 = %.1f%n", x1);
        System.out.printf("Result x2 = %.1f%n", x2);		
	}
}