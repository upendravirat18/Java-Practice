import java.util.*;
public class Budget
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int d=sc.nextInt();
     int e=sc.nextInt();
     double f=((a*350.34)+(b*230.90)+(c* 190.55)+(d* 125.30)+(e*80.90));
     if(f<=15000)
     {
      System.out.println("yes");
     }
     else
     {
       System.out.println("no");  
     }
     
    }
}
