import java.util.*;
public class Series6
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
     
      {
         int a=i*i-1;
        System.out.print(a+" ");
        i++;
        a=i*i-2 ;
        System.out.print(a+" ");
      }
    }
}
