package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        StringCollection strcol = new StringCollection();
        strcol.add("Jin");
        strcol.add("Zayka");
        strcol.add("Solnyshko");
        strcol.add("Zayka");
        for(int i = 0; i < strcol.getSize(); i++){
            System.out.print(strcol.get(i) + " ");
        }
        System.out.println("\n" + strcol.getSize());
        strcol.delete("Zayka");
        System.out.println(strcol.get(1));
        String[] str = new String[] {"Jin", "Solny"};
        System.out.println(strcol.equals(str));
        System.out.println(strcol.indexOf("Jin"));
        System.out.println(strcol.indexOf("Jane"));
        System.out.println(strcol.getSize());

    }
}

