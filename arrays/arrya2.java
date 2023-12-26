
import java.util.Scanner;

public class arrya2 {
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int[][] arr=new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the student "+(i+1)+" marks");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=s.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("student "+(i+1)+" marks are:");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
