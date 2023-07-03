package com.epam.OOP;

public class Bird extends Animal{
    private int numberOfWings;
    private boolean canFly;

  public Bird(){
      super("blue",2,false);
      this.numberOfWings = 2;
      this.canFly = true;
  }

    @Override
    public String getDescription() {
        String pawText = getNumberOfPaws() == 1 ? "paw" : "paws";
        String furStatus = hasFur() ? "fur" : "no fur";
        String wingText = numberOfWings == 1 ? "wing" : "wings";
        String flyAbility = canFly ? "can fly" : "cannot fly";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + pawText +
                " and " + furStatus + ". Moreover, it has " + numberOfWings + " " + wingText +
                " and " + flyAbility + ".";
    }

}
