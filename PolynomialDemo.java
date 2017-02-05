/**
 * This is the main method for Polynomial. We run this and see the elapsed time between the horner and naive evaluation.
 * CSC 3102 Homework Assignment # 1
 * @author Salman Bobat
 * @since 01/16/17
 * @see Polynomial
 */
import java.util.Random;
import java.util.Arrays;
public class PolynomialDemo {
    public static void main (String [] args) {

        Random randomNum = new Random (System.currentTimeMillis());

        int ranCoeffs = randomNum.nextInt(6);
        double ranEval = randomNum.nextDouble()*(1.2 - 0.5) + 0.5;


        double[] array1 = new double[1001];
        for(int i = 0; i < array1.length; i++) {
            array1[i] = ranCoeffs;
        }

        double[] array2 = new double[2001];
        for(int i = 0; i < array2.length; i++) {
            array2[i] = ranCoeffs;
        }

        double[] array3 = new double[3001];
        for(int i = 0; i < array3.length; i++) {
            array3[i] = ranCoeffs;
        }

        double[] array4 = new double[4001];
        for(int i = 0; i < array4.length; i++) {
            array4[i] = ranCoeffs;
        }

        double[] array5 = new double[5001];
        for(int i = 0; i < array5.length; i++) {
            array5[i] = ranCoeffs;
        }

        double[] array6 = new double[6001];
        for(int i = 0; i < array6.length; i++) {
            array6[i] = ranCoeffs;
        }

        double[] array7 = new double[7001];
        for(int i = 0; i < array7.length; i++) {
            array7[i] = ranCoeffs;
        }

        double[] array8 = new double[8001];
        for(int i = 0; i < array8.length; i++) {
            array8[i] = ranCoeffs;
        }

        double[] array9 = new double[9001];
        for(int i = 0; i < array9.length; i++) {
            array9[i] = ranCoeffs;
        }

        double[] array10 = new double[10001];
        for(int i = 0; i < array10.length; i++) {
            array10[i] = ranCoeffs;
        }

        double[] arr = {4, 5, 0, 2, 3, 5, -1};
        double[] arr2 = {12.5, 0, 0, -1, 7.2, -9.5};

        Polynomial f = new Polynomial(arr);
        Polynomial g = new Polynomial(arr2);

        Polynomial h = new Polynomial(array1);
        Polynomial i = new Polynomial(array2);
        Polynomial j = new Polynomial(array3);
        Polynomial k = new Polynomial(array4);
        Polynomial l = new Polynomial(array5);
        Polynomial m = new Polynomial(array6);
        Polynomial n = new Polynomial(array7);
        Polynomial o = new Polynomial(array8);
        Polynomial p = new Polynomial(array9);
        Polynomial q = new Polynomial(array10);

        //Elapsed time for each naive and horner method used
        long start = System.nanoTime();
        h.naiveEval(ranEval);
        long elapsed1 = System.nanoTime() - start;

        long start2 = System.nanoTime();
        i.naiveEval(ranEval);
        long elapsed2 = System.nanoTime()- start2;

        long start3 = System.nanoTime();
        j.naiveEval(ranEval);
        long elapsed3 = System.nanoTime() - start3;

        long start4 = System.nanoTime();
        k.naiveEval(ranEval);
        long elapsed4 = System.nanoTime() - start4;

        long start5 = System.nanoTime();
        l.naiveEval(ranEval);
        long elapsed5 = System.nanoTime() - start5;

        long start6 = System.nanoTime();
        m.naiveEval(ranEval);
        long elapsed6 = System.nanoTime() - start6;

        long start7 = System.nanoTime();
        n.naiveEval(ranEval);
        long elapsed7 = System.nanoTime() - start7;

        long start8 = System.nanoTime();
        o.naiveEval(ranEval);
        long elapsed8 = System.nanoTime() - start8;

        long start9 = System.nanoTime();
        p.naiveEval(ranEval);
        long elapsed9 = System.nanoTime() - start9;

        long start10 = System.nanoTime();
        q.naiveEval(ranEval);
        long elapsed10 = System.nanoTime() - start10;

        long start11 = System.nanoTime();
        h.hornerEval(ranEval);
        long elapsed11 = System.nanoTime() - start11;

        long start12 = System.nanoTime();
        i.hornerEval(ranEval);
        long elapsed12 = System.nanoTime() - start12;

        long start13 = System.nanoTime();
        j.hornerEval(ranEval);
        long elapsed13 = System.nanoTime() - start13;

        long start14 = System.nanoTime();
        k.hornerEval(ranEval);
        long elapsed14 = System.nanoTime() - start14;

        long start15 = System.nanoTime();
        l.hornerEval(ranEval);
        long elapsed15 = System.nanoTime() - start15;

        long start16 = System.nanoTime();
        m.hornerEval(ranEval);
        long elapsed16 = System.nanoTime() - start16;

        long start17 = System.nanoTime();
        n.hornerEval(ranEval);
        long elapsed17 = System.nanoTime() - start17;

        long start18 = System.nanoTime();
        o.hornerEval(ranEval);
        long elapsed18 = System.nanoTime() - start18;

        long start19 = System.nanoTime();
        p.hornerEval(ranEval);
        long elapsed19 = System.nanoTime() - start19;

        long start20 = System.nanoTime();
        q.hornerEval(ranEval);
        long elapsed20 = System.nanoTime() - start20;


        System.out.println("f := " + Arrays.toString(arr));
        System.out.println("deg f(x) := " + f.degree());
        System.out.println("Using Horner's method, f(3)= " + f.hornerEval(3));
        System.out.println("Using Naive method, f(3)= " + f.naiveEval(3));
        System.out.println();
        System.out.println("g := " + Arrays.toString(arr2));
        System.out.println("deg g(x) := " + g.degree());
        System.out.println("Using Horner's method, f(-7.25)= " + g.hornerEval(-7.25));
        System.out.println("Using Naive method, f(-7.25)= "+ g.naiveEval(-7.25));
        System.out.println();
        System.out.println("Empirical Analysis of Naive vs Horner's Methods");
        System.out.println("on 10 Polynomials with Random Coefficients");
        System.out.println("================================================");
        System.out.println("Degree     Naive Time (ns)    Horner's Time(ns)");
        System.out.println("------------------------------------------------");
        System.out.println(h.degree() + "          " + elapsed1 + "              " + elapsed11);
        System.out.println(i.degree() + "          " + elapsed2 + "              " + elapsed12);
        System.out.println(j.degree() + "          " + elapsed3 + "              " + elapsed13);
        System.out.println(k.degree() + "          " + elapsed4 + "              " + elapsed14);
        System.out.println(l.degree() + "          " + elapsed5 + "              " + elapsed15);
        System.out.println(m.degree() + "          " + elapsed6 + "              " + elapsed16);
        System.out.println(n.degree() + "          " + elapsed7 + "              " + elapsed17);
        System.out.println(o.degree() + "          " + elapsed8 + "              " + elapsed18);
        System.out.println(p.degree() + "          " + elapsed9 + "              " + elapsed19);
        System.out.println(q.degree() + "         " + elapsed10 + "              " + elapsed20);



    }
}
