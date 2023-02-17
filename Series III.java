import java.util.*;
public class Series3
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a=3;
     System.out.print(a);
     for(int i=1;i<=n-1;i++)
     { 
         a *=3;
       System.out.print(" "+a);
         a=+a;
     }
     
    }
}
