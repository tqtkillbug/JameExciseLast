package com.java_exscise.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> liststr = new MyList<>(6);
        liststr.add("Anh");
        liststr.add("yeu");
        liststr.add("em");
        liststr.add("nhieu");
        liststr.add("lam");
        liststr.add(1,"Khong");


        System.out.println(liststr);
    }
}
