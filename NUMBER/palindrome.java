package NUMBER;
//Write a program to check whether a number is a palindrome or not.
public class palindrome {
    public static void main(String[] args) {
        String name=new String("madam");
        String rever="";
        for (int i =name.length()-1; i>=0; i--) {
            rever=rever+name.charAt(i);
        }
        if(rever.equals(name))
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("no");
        }
    }
}
