import java.util.*;
public class Switch{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("input number");
        int a=sc.nextInt();
        System.out.println("input another number ");
        int b=sc.nextInt();
        System.out.println("input any valid operation");
        char c = sc.next().charAt(0);
        int result=0;
        switch (c)
        {    case '+':
            {
                result=a+b;
                break;
            }
            case '*':
            {
                result = a*b;
                break;
            }
            case '-':
            {
                result =a-b;
                break;
            }
            case '/':
            {
                result = a/b;
                break;
            }   
            default:
            {
                System.out.println("invalid operation");
            }
    
        }
        System.out.println("The result of operation is " +result);
    }

}