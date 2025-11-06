package com.kodilla.additional;

public class SecondMinMaxFinder {
    public static Long secondMin(long[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        Long min = null;
        Long secondMin = null;

        for(long value : arr) {
            if (min == null || value < min) {
                secondMin = min; //przesuwamy dotychczasowe min, na początku bedzie null
                min = value;
            } else if ((value > min) && (secondMin == null || value < secondMin)) {
                //jeśli liczba jest większa od min oraz (nie ma żadnego secondMin lub liczba mniejsza od secondMin
                secondMin = value;
            }
        }
        //secondMin nadal null, jesli wszystkie liczby równe lub tylko jeden unikalny element
        return secondMin;
    }

    public static Long secondMax(long[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        Long max = null;
        Long secondMax = null;

        for(long value : arr) {
            if (max == null || value > max) {
                secondMax = max; //przesuwamy dotychczasowe max, na początku będzie null
                max = value;
            } else if ((value < max) && (secondMax == null || value > secondMax)) {
                //jeśli liczba jest mniejsza od max oraz (nie ma żadnego secondMin lub liczba większa od secondMin
                secondMax = value;
            }
        }
            //secondMax będzie nadal null, jesli wszystkie liczby równe lub tylko jeden unikalny element
            return secondMax;
    }


    public static void main(String[] args) {
        //long[] tab = {3,1,1,5,6,7,9,15,3,4,7,10};
        long[] tab = {1,2,1,3};

        System.out.println("Second min value is: " + secondMin(tab));
        System.out.println("Second max value is: " + secondMax(tab));
    }

}
