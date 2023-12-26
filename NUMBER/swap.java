package NUMBER;
import java.util.Scanner;

public class swap {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();
    int temp=x;
    x=y;
    y=temp;
    System.out.println(x+" "+y);

    System.out.println();
    int[] arr={1,4,3,2,5};
    System.out.println("enter 2 values b/w 0 to "+(arr.length-1));
    int x1=s.nextInt();
    int y1=s.nextInt();
    int temp1=arr[x1];
    arr[x1]=arr[y1];
    arr[y1]=temp1;
    System.out.println();
    for (int i : arr) {
        System.out.println(i);
    }
    s.close();
   } 
}
