package NUMBER;
//. Write a program to print the Fibonacci series up to n terms
public class facb {
    public static void main(String[] args) {
        int number=10;
        facb1(number);
    }
    public static void facb1(int number)
    {
        int n1=0,n2=1;
        if(number==0||number==1)
        {
            System.out.println(number);
        }
        else{
            //System.out.print(n1+" "+n2);
            int sum=0;
            // while(number!=2)
            // {
            //     sum=n1+n2;
            //     System.out.print(" "+sum);
            //     n1=n2;
            //     n2=sum;
            //     number--;
            // }
            /*for(int i=0;i<=number;i++)
            {
                if(i<=sum)
                {
                    return;
                }
                sum=n1+n2;
                System.out.print(" "+sum);
                n1=n2;
                n2=sum;
                
            }*/
            do{
                System.out.print(n1+" ");
                sum=n1+n2;
                n1=n2;
                n2=sum;
            }while(n1<=number);
        }
    }
}
