package Javacollection.hash;

import java.util.HashSet;
import java.util.Iterator;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<Integer>();
        s.add(1);
        s.add(31);
        s.add(1234);
        s.add(123);
        s.add(14);
        //s.add(14)=>makes collision error
        //s.add()=>no null values
        //no for loop
        //advanced for loop
        for (Integer integer : s) {
            System.out.println(integer);
        }
        Iterator<Integer> i=s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(s);

    }
}
