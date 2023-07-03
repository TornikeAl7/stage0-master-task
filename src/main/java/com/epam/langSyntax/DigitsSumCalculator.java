package com.epam.langSyntax;


public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }
}
