package Javacollection.arrayLis;
import java.util.*;

import javax.swing.text.Style;

public class student implements Comparable<student>{
    int rolno;
    String name;
    float percentage;

    public student(int rolno,String name,float percentage)
    {
        this.name=name;
        this.percentage=percentage;
        this.rolno=rolno;
    }
    @override
    public String toString()
    {
        return name+" "+rolno+" "+percentage;
    }
    public static void main(String[] args) {
        ArrayList<student> a=new ArrayList<student>();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the details of rol,name,percentage of respectivily: ");
        student s1=new student(scan.nextInt(),scan.next(),scan.nextFloat());
        System.out.println("enter the details of rol,name,percentage of respectivily: ");
        student s2=new student(scan.nextInt(),scan.next(),scan.nextFloat());
        System.out.println("enter the details of rol,name,percentage of respectivily: ");
        student s3=new student(scan.nextInt(),scan.next(),scan.nextFloat());

        a.add(s1);
        a.add(s2);
        a.add(s3);

        System.out.println(a.toString());
        Collections.sort(a);
        System.out.println(a);

    }
    @Override
    public int compareTo(student s) {
        if(this.rolno<s.rolno)
        {
            return -1;
        }
        else if(this.rolno>s.rolno)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    
    }
    //@override
    public void iterable()
    {
        
    }
}
