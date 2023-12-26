import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter the size of array.");
            int[] arr=new int[scan.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("enter the "+(i+1)+" value:");
                arr[i]=scan.nextInt();
            }
            System.out.println("enter the key to search.");
            int key=scan.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==key)
                {
                    System.out.println("key found at "+(i+1)+" position");
                   // System.exit(0);
                   return;
                }
            }
            System.out.println("not found");
        }
    }
}
