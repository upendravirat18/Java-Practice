import java.util.Scanner;
public class Series4
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=0.5;
        System.out.print(a);
        for(int i=1;i<=n-1;i++)
        {
            a=a*3;
            System.out.print(" " +a);
            a=+a;
        }
    }
}
