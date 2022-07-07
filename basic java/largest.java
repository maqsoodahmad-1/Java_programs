import java.util.*;
public class largest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the " + n +" numbers in an array");
        for(int i = 0;i<n;i++)
        {
            System.out.print("\n"+"Enter the element "+(i)+":");
            arr[i] = sc.nextInt();
        }
        int max = arr[0],min = arr[0];
        for(int i = 0 ; i < n ;i++)
        {
            if (min>arr[i])
            {
                min = arr[i];
            }
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("The largest element is " + max);
        System.out.println("The smallest element is " + min);
    }

}
