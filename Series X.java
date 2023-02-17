import java.util.*;
public class Series10
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      float n=sc.nextFloat();
      double x=95.0;
      System.out.print(x);
      for(int i=1;i<n;i++)
      {
          double y=x+(20.5);
          System.out.printf(" "+y);
          x =+(2*i)+y;
      }
    }
}
