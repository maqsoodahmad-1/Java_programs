import java.util.Scanner;

public class SUM_OF_DIGITS {
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number :");
        int number =sc.nextInt();
        int sum=0;
        int n=number;
        int r;
        while(number!=0)
        {
            r=number%10;
            sum = sum +r;
            number=number/10;
        }
        System.out.println("sum of digits of " +n +" is "+sum);
        int number_of_digits = (int)Math.log10(n)+1;
        System.out.println(number_of_digits);
    }
    
}
