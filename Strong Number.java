import java.util.Scanner;
public class Strong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
           int fact=1;
       
        
        
          int s=x%10;
        for(int i=s;i!=0;i--)
         
            { fact=fact*i;
             
            }
            sum=sum+fact;
            s=s/10;
        
        if(sum==x)
        {
            System.out.println("Strong Number");
        }
        else
        {
           System.out.println("Not a Strong Number"); 
        
        }
        
    }
}
