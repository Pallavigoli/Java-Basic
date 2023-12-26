public class progm{
    public void  factors(int number){
        int a[]=new int[5];
        for (int i = 1; i <=number; i++) {
            if(number%i==0)
            {
               a[i]=i;
            }
        }
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==0)
                continue;
            System.out.print(a[i]);
        }
        System.out.println(" ");
        
    }
    public static void main(String[] args) {
        int n=4;
        progm y=new progm();
        for (int i = 1; i <=n; i++) {
            y.factors(i);
        }
        int a=10;
        int b = ++a + a++ + --a + a--;
        System.out.println(b);
    //     int itemOneWeight = 10;
    //     int itemTwoWeight = 6;
    //    int totalParcelWeight=(itemOneWeight+(itemTwoWeight/2));
    //    System.out.println("Parcel Weigth :"+totalParcelWeight);
    }
}