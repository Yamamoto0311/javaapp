package com.example;

public class GetPrime {

    // n番目の素数を返すメソッド
    public static int getPrime(int nth) {
        if (nth < 1) {
            throw new IllegalArgumentException("The input must be a positive integer.");
        }

        int count = 0;
        int num = 1;
        while (count < nth) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
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
        int nth = 10;
        int prime = getPrime(nth);
        System.out.println(nth + "th prime number is: " + prime);
    }
}
