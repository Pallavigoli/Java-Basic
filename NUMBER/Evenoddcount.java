package NUMBER;
public class Evenoddcount {
    public static void main(String[] args) {
        
        int n=5;
        for (int i = 1; i <=n; i++) {
       
            int c=(2*i)-1;
            for (int j = 1; j <i ; j++) {
                System.out.print(c-(2*j)+" ");
            }
            System.out.println();
        }
    }
}