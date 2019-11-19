package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(value -> getNumberOfOccurences(value) < maxNumberOfDuplications).toArray(Integer[]::new);

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(value -> getNumberOfOccurences(value) != exactNumberOfDuplications).toArray(Integer[]::new);
    }



    public Integer getNumberOfOccurences(Integer val){

        return Math.toIntExact(Arrays.stream(array).filter(value -> value.equals(val)).count());
    }


}