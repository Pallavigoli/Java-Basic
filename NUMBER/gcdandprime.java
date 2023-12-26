package NUMBER;
public class gcdandprime {
 public static void main(String[] args) {
    int a=3,b=9;
    /* USING WITH WHILE
    while(b!=0)
    {
       int rem=a%b;
       System.out.println("rem="+rem);
       a=b;
       System.out.println("a="+a);
       b=rem;
        System.out.println("b="+b);
       System.out.println("==========");
    }
    System.out.println(a);
    System.out.println(b);*/
    int gcd=1;
     for(int i=1;i<=a&&i<=b;i++)
     {
         if(a%i==0&&b%i==0)
         {
            gcd++;
         }
     }
     System.out.println(gcd);
 }
}