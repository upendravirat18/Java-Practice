import java.util.*;
public class Lights
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      float s=sc.nextFloat();
      float d=sc.nextFloat();
      float t=sc.nextFloat();
      double sd=s*d;
      if(sd<=t)
      {
        System.out.printf("no");
      }
      else
      {
        System.out.println("yes");
      }
      
      
    }
}
