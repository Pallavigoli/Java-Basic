
public class reverse {
    public static String reverseString(String ar)
    {
        String rev="";
        for (int i = ar.length()-1; i>=0; i--) {
            rev+=ar.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        String str="Java sql html python";
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
         arr[i]=reverseString(arr[i]);   
        }
        StringBuffer s=new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]+" ");
        }
       
        System.out.print(s.toString());
    }
}
