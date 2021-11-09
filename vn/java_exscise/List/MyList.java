package com.java_exscise.List;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapa() {
        int newSize = elements.length +1;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        size += 1;
        ensureCapa();
        elements[size - 1] = e;
    }

    public void add(int index, E element) {
        if (index >= 0 && index <= size) {
            ensureCapa();

            elements[index] = element;
        }
    }
    public void remove(int index){

    }
    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}

