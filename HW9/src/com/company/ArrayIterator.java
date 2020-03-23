package com.company;
import java.util.NoSuchElementException;

public class ArrayIterator {
    private int arraySize;
    private int index = 0;
    int[] arr = new int[arraySize];

    public ArrayIterator(int size){
        this.arraySize = size;
    }

    public void setArray(int[] array) throws Exception {
        if(arraySize == array.length){
            arr = array;
        }
        else
            throw new Exception("Entered array size doesn't fit indicated size");
    }

    public boolean hasNext() {
        return index < arr.length;
    }

    public int next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return arr[index++];
    }
}
