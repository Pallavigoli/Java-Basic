package NUMBER;
import java.util.*;
public class calculatee {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the elements");
      int a=scan.nextInt();
      int b=scan.nextInt();
      System.out.println("enter the symbol");
      char ch=scan.next().charAt(0);
      calculate(a,b,ch);
      scan.close();
    }
    public static void calculate(int a,int b,char ch)
    {
        switch (ch) {
        case '+':  
            System.out.println(a+b);
            break;
       case '%':
            System.out.println(a%b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '/':
            System.out.println(a/b);
            break;
        default:
            System.out.println("invalid operator!");
            break;
      }
    }
}
