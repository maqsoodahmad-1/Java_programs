class exception{
  public static void main(String args[]) 
  {
    try{
	int a[]= new int[7];
	a[4]=30/3;
	System.out.println("No Exception");
	}
   catch(ArrayIndexOutOfBoundsException error){
	System.out.println("Array Exception");
	}
   catch(ArithmeticException ex)
   {
	System.out.println("Arithmetic Exception");
   }
   catch(Exception ex)
   {	
	System.out.println("Common Exception");
   }
   System.out.println("OutOfTryCatch");
}	
}
