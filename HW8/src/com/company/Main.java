package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] str_arr = {"1", "2", "3", "4", "5"};
        ArrayList<String> str_list = new ArrayList<>();
        str_list.add("10");
        str_list.add("9");
        str_list.add("8");
        str_list.add("7");
        str_list.add("6");
        str_list.add("5");

        MyCustomCollection list = new MyCustomCollection();
        list.add("1");
        list.add("2");
        list.add("3");


        list.displayList();
        System.out.println("List contains 1?  " + list.contains("1"));
        System.out.println("Size of list: " + list.size() + "\n");
        list.delete("1");

        list.displayList();
        System.out.println("List contains 1? " + list.contains("1"));
        System.out.println("Size of list: " + list.size()+ "\n");

        list.delete(0);
        list.displayList();
        System.out.println("Size of list: " + list.size() + "\n");

        list.clear();
        list.displayList();
        System.out.println("Size of list: " + list.size() + "\n");

        list.addAll(str_arr);
        list.displayList();
        System.out.println("Size of list: " + list.size() + "\n");

        list.clear();
        list.displayList();
        System.out.println("Size of list: " + list.size() + "\n");

        list.addAll(str_list);
        list.displayList();
        System.out.println("Size of list: " + list.size() + "\n");
    }
}
