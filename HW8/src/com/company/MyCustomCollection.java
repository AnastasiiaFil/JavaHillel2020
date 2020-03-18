package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class MyCustomCollection implements CustomCollection {

    private Link first;

    public MyCustomCollection(){
        first = null;
    }

    public void displayList()
    {
        System.out.print("List: ");
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    @Override
    public boolean add(String str) {
        Link addedLink = new Link(str, first);
        first = addedLink;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String str: strArr){
            add(str);
        }
        return true;
    }

    @Override
    public boolean addAll(ArrayList<String> strColl) {
        strColl.forEach(str -> add(str));
        return true;
    }

    @Override
    public boolean delete(int index) {
        return delete(get(index));
    }

    @Override
    public boolean delete(String str) {
        Link current = first;
        Link previous = first;
        while(current.linkData != str)
        {
            if(current.next == null)
                return false;
            else
            {
                previous = current;
                current = current.next;
            }
        }

        if(current == first)
            first = first.next;
        else
            previous.next = current.next;

        return true;
    }

    @Override
    public String get(int index) {
        int counter = 0;
        Link current = first;

        while (counter != index) {
            current = current.next;
            counter++;
        }
        return current.linkData;
    }

    @Override
    public boolean contains(String str) {
        Link current = first;
        while(current.linkData != str) {
            if (current.next == null)
                return false;
            else
                current = current.next;
        }
        return true;
    }

    @Override
    public boolean clear() {
        this.first = null;
        return false;
    }

    @Override
    public int size() {
        int listSize = 0;
        Link current = first;

        while (current != null) {
            listSize++;
            current = current.next;
        }
        return listSize;
    }

    @Override
    public boolean trim() {
        return true;
    }
}
