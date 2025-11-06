package com.kodilla.additional.primenumber;

public class PrimeNumberFinder {
    /* liczba pierwsza musi być większa od 1 i mieć dokładnie dwa dzielniki naturalne
     (1 i samą siebie) */
    public static boolean isPrimeNumber(int number) {
        if (number < 2) return false;
            for (int i = 2; i < number-1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        return true;
    }

    /* Nie ma potrzeby sprawdzania dzielników większych niż √n,
    bo jeśli liczba ma dzielnik większy od √n, to drugi musi być mniejszy od √n. */
    public static boolean isPrimeNumberBetterPerf(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
