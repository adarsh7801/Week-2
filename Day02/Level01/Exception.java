import java.util.Scanner;


public class Exception{
	
	//creating method to generate exception and handle the exception
	public static String throwException(String Str){
		try{
			return Str.substring(5, 2);
		}catch(StringIndexOutOfBoundsException e){
			
			//returning string
			return "Incorrect parameters";
		}
	}
	
	//creating main method
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		String str = sc.next();
		
		//passing the argument to the method printing what it returns
		System.out.println(throwException(str));
		
	}
}