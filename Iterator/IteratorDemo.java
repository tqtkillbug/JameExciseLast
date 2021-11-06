package Iterator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList listCars = new ArrayList<>();
        listCars.add("Toyota");
        listCars.add("Honda");
        listCars.add("BMW");
        listCars.add("Mitsubishi");
        listCars.add("Mazda");
        Iterator<String> itr = listCars.iterator();
        while(itr.hasNext()) {
            Object car = itr.next();
            System.out.println(car);
            itr.remove();
        }
        System.out.println(listCars);
    }
}