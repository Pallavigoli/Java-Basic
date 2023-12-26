public class BubbleSort {
    public static void main(String[] args) {
    int[]  arr={84,78,12,56,29};
    System.out.println("array before sort");
    for (int i : arr) {
        System.out.println(i+" ");
    }
//1st for loop leaves the last looping
//2nd for loop leaves the last comparing and leaves the 1st loop value.
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length-1-i; j++) {
            if(arr[j]<arr[j+1])
            {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("after the sorting");
    for (int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
    }

    }
}
