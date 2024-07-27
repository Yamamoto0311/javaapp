package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetPrimeTest {

    @Test
    public void testGetPrime() {
        assertEquals(2, GetPrime.getPrime(1));
        assertEquals(3, GetPrime.getPrime(2));
        assertEquals(5, GetPrime.getPrime(3));
        assertEquals(7, GetPrime.getPrime(4));
        assertEquals(11, GetPrime.getPrime(5));
        assertEquals(13, GetPrime.getPrime(6));
        assertEquals(17, GetPrime.getPrime(7));
        assertEquals(19, GetPrime.getPrime(8));
        assertEquals(23, GetPrime.getPrime(9));
        assertEquals(29, GetPrime.getPrime(10));
    }

    @Test
    public void testGetPrimeInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> GetPrime.getPrime(0));
        assertThrows(IllegalArgumentException.class, () -> GetPrime.getPrime(-1));
    }
}
