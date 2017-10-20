import java.lang.Math;
import java.math.BigDecimal;

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

	private static void series(double x) {
		double sum = 0.0;

		for (int i = 0; i < 100; ++i) {
			sumArr[i] = (myPow(x, i) / fact(i));
		}
	}


	private static double baseOnPrev(double x, int n) {
		double sum = 1;
		for(int i = n - 1; i > 0; --i) {
			sum = 1 + x * sum / i;
		}
		return sum;
	}

	public static void main(String[] args) {

		series(X);
		double sum = 0, revSum = 0;
		System.out.println("Sumowanie od początku: ");
		for(int i = 0; i < sumArr.length; ++i) {
			sum += sumArr[i];
			System.out.println(new BigDecimal(sum).toPlainString());
		}

		System.out.println("Sumowanie od końca: ");
		for(int i = sumArr.length - 1; i >= 0; --i) {
			revSum += sumArr[i];
			System.out.println(new BigDecimal(revSum).toPlainString());
		}

		System.out.println("Sumowanie na podstawie wyrazu poprzedniego: ");
		for(int i = 1; i <= 100;++i) {
			System.out.println(new BigDecimal(baseOnPrev(X,i)).toPlainString());
		}
		System.out.println("Wynik z funkcji bibliotecznej: ");
		System.out.println(new BigDecimal(Math.exp(X)));
	}
}
