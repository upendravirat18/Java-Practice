import java.util.*;
public class Series9
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      long n=sc.nextLong();
      long x=2;
      System.out.print(x);
      for(int i=1;i<n;i++)
      {
          x=(long)Math.pow(x,2);
            x=x-1;
          System.out.printf(" "+x);
      }
    }
}
