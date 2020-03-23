package com.company;

import java.util.ArrayList;

public class NoDuplicates {

    public <T> ArrayList<T> deleteDuplicates(ArrayList<T> str_list){
        ArrayList<T> list = new ArrayList<>();
        for(T i : str_list){
            boolean flag = true;
            for(T j: list){
                if(i.hashCode() == j.hashCode())
                    flag = false;
            }
            if(flag)
                list.add(i);
        }
        return list;
    }
}
