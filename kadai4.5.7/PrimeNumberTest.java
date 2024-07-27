package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {

    @Test
    public void testGeneratePrimeNumbers() {
        List<Integer> expectedPrimesUpTo10 = List.of(2, 3, 5, 7);
        assertEquals(expectedPrimesUpTo10, PrimeNumber.generatePrimeNumbers(10));

        List<Integer> expectedPrimesUpTo20 = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        assertEquals(expectedPrimesUpTo20, PrimeNumber.generatePrimeNumbers(20));
    }

    @Test
    public void testIsPrime() {
        assertEquals(true, PrimeNumber.isPrime(2));
        assertEquals(true, PrimeNumber.isPrime(3));
        assertEquals(false, PrimeNumber.isPrime(4));
        assertEquals(true, PrimeNumber.isPrime(5));
        assertEquals(false, PrimeNumber.isPrime(10));
        assertEquals(true, PrimeNumber.isPrime(13));
    }
}
