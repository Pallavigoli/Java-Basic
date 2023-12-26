package NUMBER;
/**
 * occurence
 */
public class occurence {

    public static void main(String[] args) {
        
        int[] arr={1,2,3,1,2,4,5,1,3};
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println();
            int x=arr[i];
            int count=0;
            if(x==-1)
                continue;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==x)
                {
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(x+"->"+count);
        }
    }
}