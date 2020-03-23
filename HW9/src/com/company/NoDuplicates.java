package com.company;

import java.util.ArrayList;

public class NoDuplicates {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> deleteDuplicates(ArrayList<String> str_list){
        for(String i : str_list){
            boolean flag = true;
            for(String j: list){
                if(i.hashCode() == j.hashCode())
                    flag = false;
            }
            if(flag)
                list.add(i);
        }
        return list;
    }
}
