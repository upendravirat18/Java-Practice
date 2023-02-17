import java.util.*;
public class Series8
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int x=4;
     System.out.print(x);
     for(int i=1;i<n;i++)
     {
         x+=(int)Math.pow(i,2);
         System.out.print(" "+x);
     }
     
    }
}
