package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner ms= new Scanner(System.in);
   int principal =ms.nextInt();
   int rate= ms.nextInt();
   int time =ms.nextInt();
   int simpleIntrest =principal * rate * time/100;
   
     System.out.println("the simple interest is " +simpleIntrest);
	}

}
