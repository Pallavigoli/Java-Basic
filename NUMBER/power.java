package NUMBER;
// class power
// {
//     public static void main(String[] args) 
//     {
//       int ar[]={54,12,43,23};
//       int re=rec(ar,ar.length);
// System.out.println(re);
//     }
//     public static int rec(int ar[],int le)
//     {
//         if(le==0)
//         {
//             return ar[le];
//         }
//         else
//          return Math.max(ar[le-1], rec(ar, le-1));
//     }
// }
//import java.io.*;
 
class power {
 
    static void subsetSums(int[] arr, int l, int r, int sum)
    {
 
        if (l > r) {
            System.out.print(sum + " ");
            return;
        }
 
        subsetSums(arr, l + 1, r, sum + arr[l]);
 
        subsetSums(arr, l + 1, r, sum);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 5, 4, 3 };
        int n = arr.length;
 
        subsetSums(arr, 0, n - 1, 0);
    }
}
/*
 * Meeting Chat
Kushal Kumar
To
Everyone
11:55:39 AM
KK
import java.util.Scanner; 
  
public class MethodOverloadingCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first number: "); 
        double num1 = scanner.nextDouble(); 
        System.out.print("Enter the second number: "); 
        double num2 = scanner.nextDouble(); 
        System.out.print("Enter the operator (+, -, *, /): "); 
        char operator = scanner.next().charAt(0); 
  
        double result = calculate(num1, num2, operator); 
        System.out.println("Result: " + result); 
    }
// Method to calculate addition 
    public static double calculate(double a, double b, char operator) { 

 */