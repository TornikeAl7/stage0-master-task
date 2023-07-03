package com.epam.OOP;

public class Dog extends Animal{
    private String breed;

    public Dog() {
        super("brown", 4, true);
        this.breed = breed;
    }


    @Override
    public String getDescription() {
        String pawText = getNumberOfPaws() == 1 ? "paw" : "paws";
        String furStatus = hasFur() ? "a fur" : "no fur";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + pawText +
                " and " + furStatus + ".";
    }

}
