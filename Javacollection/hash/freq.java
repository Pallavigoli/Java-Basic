import java.util.*;
public class freq {
    public static void main(String[] args) {
        HashMap<Character,Integer>  hm=new HashMap<Character, Integer>();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter the string");
            String in=scan.nextLine();
            for (char c : in.toCharArray()) {
                hm.put(c, (hm.getOrDefault(c, 0)+1));
            }
        }
        System.out.println(hm);

        for (Map.Entry<Character,Integer> k : hm.entrySet()) {
            System.out.println(k.getKey()+" - "+k.getValue());
        }
    }    
}
