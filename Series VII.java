import java.util.*;
public class Series7
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     double x=sc.nextInt();
     double a=1.0;
     double b=2.0;
      System.out.printf("%.0f ",a);
      System.out.printf("%.1f ",b);
     for(int i=3;i<=x;i++)
     {
         if(i%2==1)
         {
             a=a*3;
              System.out.printf("%.1f ",a);
         }
         else
         {
             b=b*3;
           System.out.printf("%.1f ",b);  
         }
     }
     
    }
}
