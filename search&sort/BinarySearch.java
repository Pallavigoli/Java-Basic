import java.util.Scanner;

class BinarySearch
{
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the size of array");
    int[] arr=new int[scan.nextInt()];
    System.out.println("enter hte values of elemts");
    for(int i=0;i<=arr.length-1;i++)
    {
        arr[i]=scan.nextInt();
    }
    System.out.println("enter the value to search");
    int key=scan.nextInt();
    int high=arr.length-1,low=0;
    while(low<=high)
    {
        int mid=(high+low)/2;
        if(arr[mid]==key)
        {
            System.out.println(arr[mid]+" at "+(mid+1));
            System.exit(0);
        }
        else if(arr[mid]>key)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    scan.close();
}
}