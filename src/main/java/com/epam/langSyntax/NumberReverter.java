package com.epam.langSyntax;


public class NumberReverter {

    public void revert(int number) {
        String reversedNumber = new StringBuilder(String.valueOf(number))
                .reverse()
                .toString();

        int revertedNumber = Integer.parseInt(reversedNumber);
        System.out.println(revertedNumber);
    }

}

