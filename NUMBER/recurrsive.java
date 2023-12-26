package NUMBER;
public class recurrsive {
    public int fac(int n)
    {
        if(n==0)
            return 1;
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        recurrsive v=new recurrsive();
        System.out.println(v.fac(5));
    }
}
