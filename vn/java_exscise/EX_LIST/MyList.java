package com.java_exscise.EX_LIST;

public class MyList <E> {
    private  int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
    }

    public MyList(int capacity){
        this.elements = new Object[capacity];
    }

    public void add(int index, E element){
        if (index < size || index > 0){
            Object[] newArray = new Object[size+1];

        }
    }
}
