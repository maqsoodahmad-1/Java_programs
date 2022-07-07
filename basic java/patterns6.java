import java.util.Scanner;

public class patterns6 {
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  value of n :");
        int n =sc.nextInt();
        int number_of_rows = 2*n-1;
        for (int i=1;i<=number_of_rows;i++)
        {
           if(i<=n)
           {
               for(int j=1;j<=i;j++)
               {
                   System.out.print("8--");
               }
           }
            else
           {
               for(int k=1;k<=number_of_rows-i+1;k++)
               {
                   System.out.print("8--");
               }
           }
           System.out.println();
        }
    }
    
}

