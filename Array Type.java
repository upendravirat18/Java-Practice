import java.util.*;
public class Type
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     int even=0,odd=0;
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     if(a[i]%2==0)
     {
         even=even+1;
     }

    for(int i=0;i<n;i++)
    {
    if(a[i]%2!=0)
    {
        odd=odd+1;
    }
}
if(even==n)
{
    System.out.println("even");
}
else if(odd==n)
{
   System.out.println("odd"); 
}
else
{
 System.out.println("Mixed");    
}
}
}
