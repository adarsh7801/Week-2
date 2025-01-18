import java.util.Scanner;
public class StringCompare{
	
	//creating method to compare strings using loop
	public static boolean charatfunction(String str1, String str2){
				
		if(str1.length() == str2.length()){
			for(int i=0; i<str1.length(); i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					return false;
					
				}
			}
			return true;
		}else{
			return false;
		}
		
	}
	
	//creating method to compare strings using equals function
	public static boolean equalsFunction(String str1, String str2){
			
		if(str1.equals(str2)){
			return true;
		}else{
			return false;
		}
	}
	
	//creating main class
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two strings");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		//comparing both methods result
		if(charatfunction(str1, str2) && equalsFunction(str1, str2)){
			System.out.println("Strings are Equal");
		}else{
			System.out.println("Strings are not equal");
		}
		
		sc.close();
		
	}
}