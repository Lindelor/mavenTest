package com.lind.maven.test.datasupplier.model;

public class RandomDataModel implements BaseEntity{
    private int randomNumber;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public RandomDataModel() {
        this.randomNumber = (int) (Math.random() * 10000);
    }
}
