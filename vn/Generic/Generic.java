package com.Generic;

public class Generic<T,N> {
    T obj;
    N name;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }
}
class TestGeneric{
    public static void main(String[] args) {
        Generic<Integer,String> obj1 = new Generic<>();
        obj1.set(5);
        obj1.setName("Tien");
        System.out.println(obj1);
//        System.out.println(obj1.getName());

    }
}
