package com.stackroute.junit;

public class PowerOfFour {
    public static String PowerFour(int n) //checks whether the number is power of 4
    {

        if (n == 0)
            return null;
        while (n != 1) {
            if (n % 4 != 0)
                return "Not a power of 4";
            n = n / 4;
        }
        return "It is a power of 4";
    }
}