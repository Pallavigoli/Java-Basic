
import java.util.Scanner;

/**
 * arrya3
 */
public class arrya3 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //initialisation of 3d arr
        String[][][] arr=new String[3][][];
        System.out.println("enter the size of teams and employee");

        System.out.println("enter the team size");
        int TSize=s.nextInt();

        System.out.println("enter the eplyee size");
        int eSize=s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new String[TSize][eSize];
        }
        s.nextLine();
        //storing
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    arr[i][j][j2]=s.nextLine();
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    System.out.println("the emplye "+(j2+1)+" in team is "+(j+1)+" in branch "+(i+1)+" is "+arr[i][j][j2]);
                }
            }
        }s.close();
    }
}