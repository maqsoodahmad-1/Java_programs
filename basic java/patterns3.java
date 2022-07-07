import java.util.Scanner;

public class patterns3 
{
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  value of n :");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(i-1);k++)
            {
                System.out.print("  ");
            }
            for (int j=0;j<(n-i);j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}