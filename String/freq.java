import java.util.Arrays;

public class freq {
    public static void main(String[] args) {
        String str="Pallavi";
        countFreq(str);
    }
    public static void countFreq(String s)
    {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            count++; 
            if(arr[i]=='0')
            {
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]='0';
                }
            }
            System.out.println("Character "+arr[i]+" Frequency:"+" "+count++);
        }
    }
}
