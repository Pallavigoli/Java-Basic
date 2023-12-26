public class CheckSort {
    public static boolean checkSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={111,12,144,19,25};
        if(checkSort(arr))
        {
            System.out.println("Array is sorted");
        }
        else{
          System.out.println("Array is not sorted");  
        }
    }
}
