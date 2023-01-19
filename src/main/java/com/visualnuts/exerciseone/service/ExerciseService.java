package com.visualnuts.exerciseone.service;

import com.visualnuts.exerciseone.validations.VerificationNumbers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExerciseService {

    public static void printNumbers(Integer range) {
        List<Integer> values = generateValues(range);

        values
                .forEach(i -> System.out.println(VerificationNumbers.applyVerificationsToPrint(i)));
    }

    private static List<Integer> generateValues(Integer range) {
        List<Integer> list = new ArrayList<>();
        for(Integer i = 1; i  <= range; i++) {
            list.add(i);
        }
        return list;
    }

}
