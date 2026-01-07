package com.kodilla.additional.morsecodetranslator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeTranslatorTestSuite {

    @Test
    public void testDecode() {
        //Given
        String stringCat = "-.- --- -";
        String stringDog = ".--. .. . ...";
        String stringCat_Dog = "-.- --- -  .--. .. . ...";
        //When
        String stringCatDecoded = MorseCodeTranslator.decode(stringCat);
        String stringDogDecoded = MorseCodeTranslator.decode(stringDog);
        String stringCat_DogDecoded = MorseCodeTranslator.decode(stringCat_Dog);
        //Then
        assertEquals("KOT", stringCatDecoded);
        assertEquals("PIES", stringDogDecoded);
        assertEquals("KOT PIES", stringCat_DogDecoded);
    }

    @Test
    public void testDecode1() {
        //Given
        String stringCat = "-.- --- -";
        String stringDog = ".--. .. . ...";
        String stringCat_Dog = "-.- --- -  .--. .. . ...";
        //When
        String stringCatDecoded = MorseCodeTranslator.decode1(stringCat);
        String stringDogDecoded = MorseCodeTranslator.decode1(stringDog);
        String stringCat_DogDecoded = MorseCodeTranslator.decode1(stringCat_Dog);
        //Then
        assertEquals("KOT", stringCatDecoded);
        assertEquals("PIES", stringDogDecoded);
        assertEquals("KOT PIES", stringCat_DogDecoded);

    }
}
