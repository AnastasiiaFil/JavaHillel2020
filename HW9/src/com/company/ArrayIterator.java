package com.company;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator {
    private int arraySize;
    private int index = 0;
    T[] arr;

    public ArrayIterator(int size){
        this.arraySize = size;
    }

    public void setArray(T[] array) throws Exception {
        if(arraySize == array.length){
            arr = array;
        }
        else
            throw new Exception("Entered array size doesn't fit indicated size");
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return arr[index++];
    }
}
