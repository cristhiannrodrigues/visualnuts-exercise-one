package com.visualnuts.exerciseone.validations;

public class DivisibleBy5And3 implements Verifications {
    @Override
    public boolean validate(Integer number) {
        return number % 5 == 0 && (number % 3 == 0);
    }
}
