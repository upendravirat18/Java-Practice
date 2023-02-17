import java.util.*;
public class Hotel
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      float r=sc.nextFloat();
      int d=sc.nextInt();
      if(m==4||m==5||m==6||m==11||m==12)
      {
          double a=0.2*r;
          double c=r*d+d*a;
          System.out.printf("Hotel Tariff: Rs.%.2f",c);
      }
      else if(m==1||m==2||m==3||m==7||m==7||m==8||m==9)
          {
            float b=r*d;
            System.out.printf("Hotel Tariff: Rs.%.2f",b);
          }
          else
          System.out.println("Invalid Input");
    }
}
