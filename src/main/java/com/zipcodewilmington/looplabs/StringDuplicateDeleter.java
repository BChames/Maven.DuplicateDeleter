package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray){
        super(intArray);
    }

        @Override
        public String[] removeDuplicates(int maxNumberOfDuplications) {
           return Arrays.stream(array).filter(value -> getNumberOfOccurences(value) < maxNumberOfDuplications).toArray(String[]::new);

        }

        @Override
        public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
           return Arrays.stream(array).filter(value -> getNumberOfOccurences(value) != exactNumberOfDuplications).toArray(String[]::new);
        }



    public Integer getNumberOfOccurences(String val){

       return Math.toIntExact(Arrays.stream(array).filter(value -> value.equals(val)).count());
    }
}


