import java.util.*;
class exception1{
  public static void main(String args[])
  {

	Scanner sc =new Scanner(System.in);
	int a[]=new int[5];
        try
	{
	   for(int i=0;i<5;i++)
	  {
		a[i]=sc.nextInt();
	  }
        }
	catch(ArrayStoreException error)
	{
		System.out.println("Array Store Exception");
        }	
	System.out.println("Out of Try Catch ");
}
}
       
