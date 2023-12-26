
public class methods {
    public static void main(String[] args) {
        String str=new String("kodnest");
        String str1=str.intern();
        System.out.println(str1);
        String str3="kodnest";
        if(str1==str3)
        {
            System.out.println("in Stringpool");
        }
        else{
            System.out.println("in heap only");
        }
    }
}

