package com.learning_java24.N10_MathsForDsa;

public class N1_PrimeNumbers {

    public static void main(String[] args) {

        int n = 40;

        boolean[] arr = new boolean[n+1];

        seive(n,arr);

//        // one way to find prime number until given range
//        for (int i = 0; i <= 15; i++) {
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }

    }

    public static void seive(int n, boolean[] prime) {

        for (int i = 2; i < n; i++) {

            if(!prime[i]){
                for (int j = i*2; j < n; j+=i) {
                    prime[j] = true;
                }
            }

        }
        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }

    }

    //Sieve of Eratosthenes

    public static void sieve(int n, boolean[] arr){

    }

    // To check if particular number is prime or not
    public static boolean isPrime(int n) {

        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;

//        for (int i = 2; i * i < n; i++) {
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
    }
}
