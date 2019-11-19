package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(){}

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
        Stream<T> stream = Arrays.stream(array);

    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);




}
