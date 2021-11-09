package com.java_exscise.iotextfile.writeFileproductmanager;

import com.java_exscise.iotextfile.readWriteFileStudent.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(154,"ban la", "vinahome", 10000, "ban la quan ao cao cap"));
        products.add(new Product(451,"May hut bui", "xiaomi", 50000, "may hut bui thong minh"));
        products.add(new Product(447,"May say toc", "samsung", 30000, "may say toc han quoc"));
        products.add(new Product(324,"Noi com", "lg", 12000, "noi com lg dang cap han quoc"));
        writeToFile("sourceText.txt", products);
        List<Product> productList1  = readDataFromFile("sourceText.txt");

    }
    public static void writeToFile(String path, List<Product> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
