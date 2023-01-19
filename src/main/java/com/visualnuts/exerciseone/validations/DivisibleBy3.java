package com.visualnuts.exerciseone.validations;

public class DivisibleBy3 implements Verifications {
    @Override
    public boolean validate(Integer number) {
        return number % 3 == 0;
    }
}
