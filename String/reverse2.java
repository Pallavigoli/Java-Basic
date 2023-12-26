import java.util.*;
public class reverse2 {
    public static String stringrev(String rev)
    {
      String ans = "";
      String[] arr=rev.split(" ");//O(n)
     // String[] arr=rev.split("//s+");//O(1)
      for (int i = arr.length-1; i>=0; i--) {
            ans+=(arr[i]+" ");//O(n)
      }   
      return ans;//O(n)
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //geeks quiz practice code
        String intput=scan.nextLine();//O(1)
        String newstr=stringrev(intput);//O(n)
        System.out.println(newstr);//O(1)
        scan.close();
    }
}
