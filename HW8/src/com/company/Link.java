package com.company;

class Link {
    public String linkData;
    public Link next;

    public Link(String data, Link first)
    {
        this.linkData = data;
        this.next = first;
    }

    public void displayLink()      // Вывод содержимого элемента
    {
        System.out.print("{" + linkData + "} ");
    }
}
