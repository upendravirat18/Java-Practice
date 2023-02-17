import java.util.Scanner;
public class Series5
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a=11;
     int b;
     for(int i=1;i<=n;i++)
     {
         b=a*a;
         System.out.print(" "+b);
         a=a+4;
     }
    }
}
