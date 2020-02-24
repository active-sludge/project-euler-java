package com.activesludge;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10,001st prime number?
*/

public class Problem_7_10001st_Prime {
    /*
    Returns the requested prime number
    */
    public static long nthPrime(long n) {
        int numberOfPrimes = 0;
        long prime = 1;

        while (numberOfPrimes < n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
    }

    /*
    Returns true if parameter n is a prime number
    */
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

