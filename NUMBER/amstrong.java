package NUMBER;
//Write a program to check whether a number is armstrong numbers or not.
public class amstrong {
   public static void main(String[] args) {
    int num=371,arm=0,ori=num,di=num,count=0;
    while (di!=0) {
      di/=10;
      count++;
    }
    while (num!=0) {
     int rem=num%10;
      arm=(int)(arm+Math.pow(rem, count));
      num/=10;
    }
    System.out.println(arm==ori);
   } 
}
