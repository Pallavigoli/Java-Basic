package NUMBER;
//28. Write a program to calculate the sum of digits of a number.
public class digit {
    public static void main(String[] args) {
        int a=12,sum=0,rem=0;
        while(a!=0)
        {
            rem=a%10;
            sum+=rem;
            a/=10;
        }
        System.out.println(sum);
    }
}
