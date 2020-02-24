package com.activesludge;
import java.util.Scanner;

public class Problem_6_SumSquareDifference {

    public static int getDifference(int givenInteger) {
        return getSumSquared(givenInteger) - getSquaredSum(givenInteger);
    }

    public static int getSumSquared(int givenInteger) {
        int summedNumber = 0;
        int sumSquared = 0;
        for (int i = 1; i <= givenInteger; i++) {
            summedNumber += i;
        }
        sumSquared = summedNumber * summedNumber;
        return sumSquared;
    }

    public static int getSquaredSum(int givenInteger) {
        int squaredSum = 0;
        for (int i = 1; i <= givenInteger; i++) {
            int squaredNumber = i * i;
            squaredSum += squaredNumber;
        }
        return squaredSum;
    }

}
