import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        int num,i,count=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        System.out.println("Prime Number");
        else
         System.out.println("Not a Prime");
     
    }
}
