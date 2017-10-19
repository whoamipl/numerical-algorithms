import java.lang.Math;
import java.util.Scanner;


public class Edox {

	private static double fact(int x) {

		double f = 1;
		if ( x == 0 )
			return 1;
		else {
			for (int i = 1; i <= x; ++i) {
				f *= i;
			}
		}
		return f;
	}

	private static double myPow(double a, int b) {
		double res = 1;
		for (int i = 1; i <= b; ++i ) {
			res *= a;
		}
		return res;
	}

	private static double withBulidInMethod(double x) {
		return Math.exp(x);
	}

	private static double series(double x) {
		double sum = 0.0;

		for (int n = 0; n < 20; ++n) {
			sum += (myPow(x, n) / fact(n));
		}
		return sum;
	}

	private static double baseOnPrev(double x) {

		double prev = Math.exp(x-1);
		return prev += prev * (x/((5)+1));
	}

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		// System.out.print(" Sposób pierwszy   ");
		// System.out.print(" Sposób drugi      ");
		// System.out.print(" Sposób Trzeci     ");
		System.out.println();
		System.out.print(" "+series(x));
		System.out.print(" "+withBulidInMethod(x));
		System.out.print(" "+baseOnPrev(x));
		System.out.println();
	}

}
