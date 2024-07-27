package com.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    // 素数リスト生成メソッド
    public static List<Integer> generatePrimeNumbers(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    // 素数判定メソッド
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 100;
        List<Integer> primes = generatePrimeNumbers(limit);
        System.out.println("Prime numbers up to " + limit + ": " + primes);
    }
}
