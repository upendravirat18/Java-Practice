import java.util.*;
public class Lab
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter X");
      int l1=sc.nextInt();
      System.out.println("Enter Y");
      int l2=sc.nextInt();
      System.out.println("Enter Z");
      int l3=sc.nextInt();
      if(l1<l2 && l1<l3)
      {
        System.out.println("L1 has the minimal seating capacity");
      }
      else if(l2<l1 && l2<l3)
      {
      System.out.println("L2 has the minimal seating capacity");
    }
    else
    {
      System.out.println("L3 has the minimal seating capacity");
    }
    }
}
