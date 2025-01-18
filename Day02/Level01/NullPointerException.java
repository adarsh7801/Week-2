public class NullPointerException{
	
	//creating method to throw exception
	public static int showingException(String str){
		
		return str.length();
		
	}
	
	//creating method to handle exception
	public static void exceptionHandelling(String str){
	
		System.out.println("The string is null");
	
	}
	
	
	public static void main(String[] args){
		
		//assigning null value to string
		String str = null;
		
		//hndelling exception using try catch block
		try{
			System.out.println(showingException(str));
		} catch(Exception e){
			
			System.out.println("Exception : " +e);
			exceptionHandelling(str);
		}
		
		
	}
	
	
}