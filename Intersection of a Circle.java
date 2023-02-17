import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int d=sc.nextInt();
     int e=sc.nextInt();
     int f=sc.nextInt();
     int g=(int)(Math.sqrt(((d-a)*(d-a))+((e-b)*(e-b))));
     if(g==c+f)
     {
        System.out.println("The circles are tangential"); 
     }
     else if(g<=c+f)
     {
       System.out.println("The circles overlap");   
     }
     else
     {
      System.out.println("The circles do not overlap");  
     }
    }
}
