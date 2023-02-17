import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int i,sum=0;
      for(i=0;i<=num;i++)
      {
         sum=sum+i;
      }        
      System.out.println(sum);

    }
}
