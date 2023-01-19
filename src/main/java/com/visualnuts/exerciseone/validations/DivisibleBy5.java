package com.visualnuts.exerciseone.validations;

public class DivisibleBy5 implements Verifications {
    @Override
    public boolean validate(Integer number) {
        return number % 5 == 0;
    }
}
