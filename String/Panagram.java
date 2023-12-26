import java.util.*;

public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        boolean isPangram = isPangram(inputString);
        if (isPangram) {
            System.out.println("The given string is a pangram.");
        } else {
            System.out.println("The given string is not a pangram.");
        }
    }

// Your code to find the given string is pangram or not
public static boolean isPangram(String inp)
{
   // int[] q=new int[126];
   String in=inp.toLowerCase();
   for (char i = 'a'; i<='z'; i++) {
    if(!(in.contains(i+"")))
    {
        return false;
    }
    }
    return true;
}
}