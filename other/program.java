package other;
/**
 * program
 */
public class program {
    public static void main(String[] args) {
        program p=new program();
        int num=9,re=6;
        int rev=p.reverse(num,re);
        int lcm=(num*re)/rev;
        System.out.println(lcm);
    }
    public int reverse(int n,int rev)
    {
        if(rev==0)
        {
            return n;
        }
        return reverse(rev, n%rev);
    } 
}