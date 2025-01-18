public class StringIndexOutOfBound{
	
	public static String exceptionHandelling(String str){
		
		String a;
		
		try{		
			a= Character.toString(str.charAt(5));
			return a;
		}
		catch(StringIndexOutOfBoundsException e){
			return "String Index Out Of Bounds";
		}
	}
	
	
	
	public static void main(String[] args){
		
		String str = "Hello";
		
		System.out.println(exceptionHandelling(str));
		
	}
}