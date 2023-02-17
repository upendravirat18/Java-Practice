import java.util.*;
public class Series2
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int result=6;
     int add=5;
     System.out.print(result);
     for(int i=1;i<=n-1;i++)
     {
         result +=add;
        System.out.print(" "+result);
        add+=5;
     }
    }
}
