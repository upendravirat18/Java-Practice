import java.util.*;
public class Dine
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int i=sc.nextInt();
      if(s.equals("front") && (i==1))
      {
        System.out.println("Left Handed");
        
      }
      else if(s.equals("front") && (i==2))
      {
       System.out.println("Right Handed");   
      }
      else if(s.equals("rear") && (i==1))
      {
        
        System.out.println("Right Handed");
      }
      else
      {
       System.out.println("Left Handed");   
      }
      
    }
}
