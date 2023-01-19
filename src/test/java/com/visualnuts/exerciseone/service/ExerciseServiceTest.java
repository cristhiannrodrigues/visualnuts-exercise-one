package com.visualnuts.exerciseone.service;

import org.junit.Before;
import org.junit.Test;

public class ExerciseServiceTest {

    private final Integer RANGE = 500;

    @Test
    public void printNumberTest() {
        ExerciseService.printNumbers(RANGE);
    }

}
