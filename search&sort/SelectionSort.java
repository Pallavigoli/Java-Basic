public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,24,6,4,234,4};
        System.out.println("before sorting");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("after sorting");
        for(int i=0; i<arr.length; i++)  
       {  
           for(int j=i+1; j<arr.length; j++)  //j goes next of i^th value
           {  
               if(arr[i] > arr[j])  
               {  
                  int temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
       for (int i : arr) {
        System.out.println(i);
       }
    }
    }
    