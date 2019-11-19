package com.zipcodewilmington.looplabs;

import org.junit.Test;

public class TestMyTest {

    @Test
    public void testNumOfOccurences(){

        //given
        String[] testArr = new String[]{"1","1","1","3","3","3","3"};
        StringDuplicateDeleter test = new StringDuplicateDeleter(testArr);

        System.out.println(test.getNumberOfOccurences("1"));
    }
}
