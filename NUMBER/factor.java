package NUMBER;
import java.util.Scanner;
//finding the factor of the given number
public class factor {
    
    public boolean factoring(int a,int b)
    {
        if(a%b==0)
        {
            System.out.println("the number "+a+" is divisble by "+b);
            return true;
        }
        else 
        {        
            System.out.println("the number "+a+"is not divisble by "+b);
            return  false;
        }
        
    }
    public static void main(String[] args) {
        factor f=new factor();
        Scanner s=new Scanner(System.in);
        System.out.println("enter two integer numbers:");
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println(f.factoring(num1, num2));
        s.close();
    }
}
