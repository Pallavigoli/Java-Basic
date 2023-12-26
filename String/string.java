class string
{
    public static void main(String[] args) {
        String s="hello world, hello er";
        String[] v=s.split(" ");
        for(int i=0;i<v.length;i++)
        {
            int count=0;
            for(int j=i+1;j<v.length;j++)
            {
                if(v[i].equals(v[j]))
                {
                   v[j]=" ";
                   count++;
                }
            }
            if(count<=1&&v[i]!=" ")
            {
                System.out.print(v[i]+" ");
            }
            else
            System.out.print(" ");
        }
    }
}