
public class arr1 {
    public static void main(String[] args) {
        //int mul=1;
        int[] arr={2,2,2,2};

        for(int i : arr){
            System.out.print(i+"");
        }
System.out.println();
        for (int i=0;i<arr.length;i++) {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}