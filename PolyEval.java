/**
 * This is an interface that is implemented in the Polynomial Class
 * CSC 3102 Homework Assignment # 1
 * @author Salman Bobat
 * @since 01/16/17
 * @see Polynomial
 */
public interface PolyEval {

    /**
     * Evaluates this polynomial at the specified point using the
     * Horner's evaluation method.
     * @param x the point at which this polynomial is to be evaluated.(variable)
     * @return the value of the polynomial at the specified point.
     */
    double hornerEval(double x);

    /**
     * Evaluates this polynomial at the specified point using a naive
     * evaluation method.
     * @param x the point at which this polynomial is to be evaluated. (variable)
     * @return the value of the polynomial at the specified point
     */
    double naiveEval(double x);

    /**
     * Gives the degree of this polynomial.
     * @return the degree of this polynomial
     */
    int degree();

    /**
     * Gives a string representation of this polynomial in descending powers
     * as an array of its coefficients.
     * @return a string representation of this polynomial as an array
     */
    String toString();
}

