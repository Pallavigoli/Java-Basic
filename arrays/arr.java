
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] ar=new int[3][];
        ar[0]=new int[4];
        ar[1]=new int[5];
        ar[2]=new int[3];
        //storing
        for (int i = 0; i <=ar.length-1; i++) {
            for (int j = 0; j <=ar[i].length-1; j++) {
                System.out.print("enter the marks "+(i+1)+" "+(j+1)+" : ");
                   ar[i][j]=s.nextInt();
                }
                System.out.println();
            }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                   System.out.print(ar[i][j]+" ");
                }
                System.out.println();
            }
            s.close();
        }
    }
