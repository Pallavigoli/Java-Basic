public class SumRowCols {
    public static void main(String[] args) {
        int a[][] = {       
            {1, 2, 3},    
            {4, 5, 6},    
            {7, 8, 9}    
        };    
        
        System.out.println("sumrows");
        for (int i = 0; i < a.length; i++) {
            int sumrows=0;
            for (int j = 0; j < a.length; j++) {
                sumrows=sumrows+a[i][j];
            }
            System.out.println(sumrows);
        }
        System.out.println("==============");
        
        System.out.println("sumcol");
        for (int i = 0; i < a.length; i++) {
            int sumcol=0;
            for (int j = 0; j < a.length; j++) {
                sumcol = sumcol + a[j][i];   
            }
            System.out.println(sumcol);
        }
    }
}