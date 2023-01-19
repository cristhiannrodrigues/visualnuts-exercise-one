package com.visualnuts.exerciseone.validations;

public class VerificationNumbers {

    public static String applyVerificationsToPrint(Integer number) {
        return new DivisibleBy5And3().validate(number) ? "Visual Nuts" :
                new DivisibleBy5().validate(number) ? "Nuts" :
                new DivisibleBy3().validate(number) ? "Visual" : number.toString();
    }

}
