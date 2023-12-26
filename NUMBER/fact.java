package NUMBER;
import java.util.Scanner;
// no.of factorial
public class fact {
    public int factr(int number)
    {
        if(number==1)
            return 1;
        else
            return number*factr(number-1);
    }
    public static void main(String[] args) {
        fact f=new fact();
        Scanner s=new Scanner(System.in);
        int numbers=s.nextInt();
        for (int i = 1; i <=numbers; i++) {
            System.out.println(f.factr(i)); 
        }
        s.close();
    }
}
