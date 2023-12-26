package NUMBER;
public class StrongNumber {
    public static void main(String[] args) {
        recurrsive s=new recurrsive();//in another class
        int number=145;
        int or=number;
        int w=0;
        while(number!=0)
        {
            int er=number%10;
            w +=s.fac(er);
            number=number/10;
        }
        if(or==w)
        System.out.println(or+" == "+w);
    }
}
