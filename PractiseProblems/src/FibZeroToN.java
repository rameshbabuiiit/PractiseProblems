import java.util.Scanner;

/**
 * @author RAMESH POLUDASU
 * @description This piece of code prints first n(given input) fibonacci numbers 
 */
public class FibZeroToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide fibonacci series end point#");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}
		sc.close();
	}

	public static int fib(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

}
