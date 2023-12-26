package Recersive;

public class Stringlen {
    public static void main(String[] args) {
    String str="programming";
    StringBuilder st=new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i)==str.charAt(i+1))   
        {
            continue;
        }     
        st.append(str.charAt(i));
    }
    System.out.println(st);
     
    }
}
