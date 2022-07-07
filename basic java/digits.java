import java.util.*;


public class digits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit number : ");
        int number =sc.nextInt();
        System.out.println("Individual digits of a 3 " + "digit no are :\n");
        while( number!=0 )
        {
            int r = number % 10;
            number = number /10;
            System.out.print(+r+"\t");
        }
        System.out.println();

    }


    
}
