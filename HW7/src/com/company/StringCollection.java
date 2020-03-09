package com.company;

public class StringCollection {
    private String[] array;

    public StringCollection(){
        this.array = new String[0];
    }

    public void add(String str){
        String[] new_arr;
        if(this.array.length != 0) {
            new_arr = new String[this.array.length + 1];
            for (int i = 0; i < this.array.length; i++){
                new_arr[i] = this.array[i];
            }
            new_arr[this.array.length] = str;
        }
        else new_arr = new String[] {str};

        this.array = new_arr;
    }

    public void delete(String str){
        int elementNumber = getNumberOfWantedElement(str);
        String[] new_arr = new String[this.array.length - elementNumber];
        int j = 0;
        for (int i = 0; i < this.array.length; i++){
            if (!this.array[i].equals(str)) {
                new_arr[j] = this.array[i];
                j++;
            }
        }
        this.array = new_arr;
    }

    private int getNumberOfWantedElement(String str){
        int counter = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i].equals(str)){
                counter++;
            }
        }
        return counter;
    }

    public String get(int index) throws Exception {
        if(this.array.length - 1 < index){
            throw new Exception("Index is not appropriate. Array has smaller size");
        }
        return this.array[index];
    }

    public boolean contains(String str){
        return getNumberOfWantedElement(str) > 0;
    }

    public boolean equals(String[] str2){
        boolean flag = true;
        if(this.array.length != str2.length){
            flag = false;
        }
        else{
            for (int i = 0; i < this.array.length; i++){
                if(this.array[i] != str2[i]){
                    flag = false;
                }
            }
        }
        return flag;
    }

    public void clear(){
        this.array = new String[0];
    }

    public int indexOf(String str){
        int elementNumber = getNumberOfWantedElement(str);
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

    public int getSize(){
        return this.array.length;
    }
}

