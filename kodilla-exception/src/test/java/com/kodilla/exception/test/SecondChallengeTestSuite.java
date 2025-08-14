package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0999, 1.6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99999, 1.4999)),

                () -> assertDoesNotThrow( () -> secondChallenge.probablyIWillThrowException(1.5, 1)),
                () -> assertDoesNotThrow( () -> secondChallenge.probablyIWillThrowException(1.9999, 1.4999)),
                () -> assertDoesNotThrow( () -> secondChallenge.probablyIWillThrowException(1, 1.5001))

        );
    }
}
