import java.util.*;
public class Garden
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
      if(c<=1 && c>=a ||(b%c==0)||(c%b==1))
      System.out.println("yes");
      else
      System.out.println("no");
     
     
    }
}
