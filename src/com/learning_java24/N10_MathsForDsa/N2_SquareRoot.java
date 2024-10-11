package com.learning_java24.N10_MathsForDsa;

public class N2_SquareRoot {

    public static void main(String[] args) {

        int n = 40;

        System.out.println(sqrt(n));
        System.out.printf("%.2f",sqrt(n,3));

    }

    // Newton Raphson method

    public static double sqrt(int n){

        double x = n;
        double root;

        while(true){

            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x) < 0.5){
                break;
            }

            x = root;
        }
        return root;
    }


    //Time : O(log(n)) 
    public static double sqrt(int n, int p){

        int s = 0;
        int e = n;

        double root = 0.0;

        while(s <= e){
            int m = s + (e-s) / 2;

            if(m * m == n){
                return m;
            }

            if(m * m > n){
                e = m - 1;
            }else{
                s = m + 1;
                root = m;
            }

        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;

    }

}
