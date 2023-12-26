public class reverse3 {
 public static void main(String[] args) {
    String s="java is fun";
    //int j=0;
    char[] arr=s.toCharArray();
    System.out.println(arr);
    char[] rev=new char[arr.length];
    for(int i=arr.length-1;i>=0;i--)
    {
        if(arr[i]==' ')
        {
            rev[i]=' ';
        }
    }
    
    System.out.println();//ss);
    // for(int i=arr.length-1;i>=0;i--)
    // {
    //     if(arr[i]=' ')
    //     {
    //         rev[i]=' ';
    //     }
    // }
    

    String newsString=new String(rev);
    System.out.print(newsString);
 }   
}
