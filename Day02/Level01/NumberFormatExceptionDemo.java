import java.util.Scanner;

public class NumberFormatExceptionDemo{
	
	//creating method to generate exception and handle the exception
	public static int generatingException(String str){
		try{
			int i = Integer.parseInt(str);
			return i;
		}catch(NumberFormatException e){
			return 0;
		}
		
		
	}
	
	//creating the main method
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		String str = sc.nextLine();
		
		//calling the method and printing its return value
		System.out.println(generatingException(str));
		
		//closing the scanner
		sc.close();
	}
}