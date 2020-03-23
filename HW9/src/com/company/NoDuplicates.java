package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class NoDuplicates {

    public <T> Collection<T> deleteDuplicates(ArrayList<T> list){
        return new HashSet<>(list);
    }
}
