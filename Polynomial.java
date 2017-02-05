/**
 * This class has multiple methods to evalute in naive and horner methods and to find the degree.
 * CSC 3102 Homework Assignment # 1
 * @author Salman Bobat
 * @since 01/16/17
 * @see PolyEval
 */
public class Polynomial implements PolyEval {

    double [] coeffs = new double[] {0};
    int deg;
    //Default constructor for Polynomial
    public Polynomial () {

    }
    //Constructor for Polynomial
    public Polynomial(double [] c) {

        this.coeffs = c;
    }

    /**
     * Evaluates this polynomial at the specified point using the
     * Horner's evaluation method.
     * @param x the point at which this polynomial is to be evaluated.(variable)
     * @return the value of the polynomial at the specified point.
     */
    @Override
    public double hornerEval(double x) {
        double n = coeffs[0];
        for(int i = 1; i <= degree(); i++ ) {
            n = coeffs[i] + (x * n);
        }

        return n;
    }

    /**
     * Evaluates this polynomial at the specified point using a naive
     * evaluation method.
     * @param x the point at which this polynomial is to be evaluated. (variable)
     * @return the value of the polynomial at the specified point
     */
    @Override
    public double naiveEval(double x) {
        double m = 0;
        double n = coeffs[degree()];
        for (int i = degree() - 1; i >= 0; i-- ) {
            m++;
            double z = 1;
            for(int j = 1; j <= m; j++) {
                z *= x;
            }
            n += coeffs[i] * z;
        }
        return n;
    }

    /**
     * Gives the degree of this polynomial.
     * @return the degree of this polynomial
     */
    @Override
    public int degree() {
        return coeffs.length - 1;
    }


}
