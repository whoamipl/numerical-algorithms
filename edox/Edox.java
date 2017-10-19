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


    private static double series(double x) {
        double sum = 0.0;

        for (int n = 0; n < 20; ++n) {
            sum += (myPow(x, n) / fact(n));
            System.out.println( n + " " + sum );
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = in.nextInt();

        System.out.println("e^"+ x +" = " + series(x));

    }

}
