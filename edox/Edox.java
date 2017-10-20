import java.lang.Math;
import java.util.Scanner;

public class Edox {

	static double[] sumArr = new double[100];
	final static int X = 1;
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

	private static void series(double x) {
		double sum = 0.0;

		for (int i = 0; i < 100; ++i) {
			 sumArr[i] = (myPow(x, i) / fact(i));
		}
	}

	// private static double reverseSeries(double x, int n) {
	// 	double sum = 0.0;
	// 	for (int i = n; i > 0; --i) {
	// 		 (myPow(x, i) / fact(i));
	// 	}
	// 	return sum;
	// }
	private static double sum
	(double[] args) {
		double sum = 0;
		for (int i = 0; i < args.length; ++i) {
			sum += args[i];
		}
		return sum;
	}
	private static double reverseSum (double[] args) {
		double sum = 0;
		for (int i = args.length - 1; i > 0; --i) {
			sum += args[i];
		}
		return sum;
	}
	// private static double baseOnPrev(double x, int n) {
	//
	// }

	public static void main(String[] args) {

		//int n = Integer.parseInt(args[0]);
		// System.out.print(" Sposób pierwszy   ");
		// System.out.print(" Sposób drugi      ");
		// System.out.print(" Sposób Trzeci     ");
		series(X);
		System.out.println();
		System.out.println("Przód: " + sum(sumArr));
		System.out.println("Tył:   " + reverseSum(sumArr));

	}

}
