import java.util.*;
import java.util.regex.Pattern;
public class reg {
    public static void main(String[] args) {
        System.out.println("enter username:");
        String username=new Scanner(System.in).nextLine();
        int number=3;
        while(number!=0)
        {
            if(Pattern.matches("^[a-zA-Z0-9_]+$", username))
            {
                System.out.println("enter password:");
                String password=new Scanner(System.in).nextLine();
                if(Pattern.matches("[a-zA-Z0-9@#!%&]", password))
                {
                    System.out.println("u haved singed in");
                    break;
                }
                else{
                    System.out.println("please reset password");
                    String newpass=new Scanner(System.in).nextLine();
                    Pattern.matches("[a-zA-Z0-9@#!%&]{7}", newpass);
                }
            }
            else{
                System.out.println("reenter username");
                break;
            }
            number--;
        }
        if(number==0)
        {
            System.out.println("please reset password/username");
        }

    }
}
