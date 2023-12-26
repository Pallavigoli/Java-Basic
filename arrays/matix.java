import java.util.Scanner;

/**
 * matix "N"
 *  for(int i=1;i<=s;i++)
        {
            for (int j =1; j <=s; j++) {
                if(j==1||j==s)
                    System.out.print(" *");
                if((i!=1&i!=s&&j!=1&&j!=s)&& i==j)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

        if(i==1||i==(s/2)||i==(s)||j==1||j==(s/2)||j==s||i==j||(i+j)==(s))
                {
                    System.out.print("*  ");
                }
 */
/*
 * matirx B
 * for(int i=1;i<s;i++)
        {
            for (int j =1; j <s; j++) {
                if(i==1||i==s/2||j==1||j==s-1||i==s-1) 
                {
                    System.out.print("|");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
 */
public class matix {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int s=scan.nextInt();
        for(int i=1;i<s;i++)
        {
            //C
            for (int j =1; j <s; j++) {
                if(i==1||j==1||i==s-1) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int k = 0; k<1;k++) {
                System.out.print("\t");
            }
            //B
            for (int  d=1; d <s; d++) {
                if(i==1||i==s/2||d==1||d==s-1||i==s-1) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int k = 0; k<1;k++) {
                System.out.print("\t");
            }
            //I
            for (int j = 1; j < s; j++) {
                if(i==1||i==s-1||j==s/2){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
             for (int k = 0; k<1;k++) {
                System.out.print("\t");
            }
            //P
            for (int j = 1; j <s; j++) {
                if(i==1||j==1||i==s/2||(i<=s/2&&j==s-1))
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            for (int k = 0; k<1;k++) {
                System.out.print("\t");
            }
            //N
            for (int j =1; j <=s; j++) {
                if(j==1||j==s)
                    System.out.print("*");
                if((i!=1&&i!=s-1&&j!=1&&j!=s-1)&& i==j)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            for (int k = 0; k<1;k++) {
                System.out.print("\t");
            }
            //S
            for (int j = 1; j < s; j++) {
                if(i==1||i==s-1||(i<=s/2&&j==1)||(i>=s/2&&j==s-1)||i==s/2)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            for (int k = 0; k<1;k++) {
                System.out.print("\t");
            }
            //Z
            for (int j = 1; j < s; j++) {
                if(i==1||i==s-1||i+j==s+1)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
}