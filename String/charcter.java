//Write a Java program that accepts a character and identifies if it's a lower-case vowel, 
//upper-case vowel, lower-case consonant, upper-case consonant, digit, or special character.
import java.util.*;
public class charcter
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ente the charctaer:");
        char v=s.next().charAt(0);
        
        if(v>='a' && v<='z')
        {   
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
            {
                 System.out.println("lower vowle");
            }
            else
            {
                System.out.println("lower consonant");
            }   
        }
        else if(v>='A' && v<='Z')
        {   
            if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
            {
                System.out.println("upper vowel");
            }
            else
            {
                System.out.println("upper consonat");
            }
        }
        else if(v>=1&&v<=9)
        {
            System.out.println("digit");
        }
        else{
            System.out.println("specail character");
        }
        s.close();
    }
}