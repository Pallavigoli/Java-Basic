package NUMBER;
public class prime {
    public static void main(String[] args) {
        int p=10;
        for(int i=1;i<=p;i++)
        {
            if(isprime(i))
           {
            System.out.println(i);
           }
        }
    }
    public static boolean isprime(int n)
    {
        if(n==1||n==0)
            return false;
        //<=Math.floor(Math.sqrt(n))
        //<=n
        //<=n/2
        for(int i=2;i<= n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
