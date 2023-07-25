package com.jap;

/**
 * Hello world!
 *
 */
public class App {

    public static int[] fibonacciSeries(int n) throws IllegalAccessException {
        if (n <= 0) {
            throw new IllegalAccessException("n Should be greater than 0");
        }

        int[] fibo = new int[n];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    return fibo;
}
    public static void main( String[] args ) {
            App obj=new App();

        try {

            for(int num: fibonacciSeries(12)){
                System.out.println(num);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
