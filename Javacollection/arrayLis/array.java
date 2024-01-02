package Javacollection.arrayLis;

import java.util.*;

public class array {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(45);
        a.add(5);
        a.add(345);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.contains(5));
        Iterator i=a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}