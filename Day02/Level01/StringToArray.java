import java.util.Scanner;

public class StringToArray {
	
	//creating method to take the string characters
    public static String substringUsingLoop(String s) {
        String b = "";
        for (int i = 0; i < s.length(); i++) {
            b = b + s.charAt(i);
        }
        return b;
    }
	
	//saving the characters in array
    public static char[] toArray(String s) {
        char a[] = s.toCharArray();
        return a;
    }

    public static void main(String[] args) {
		
		//making scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking input of string
        System.out.println("Enter the String");
        String s = sc.nextLine();
		
        char ch[] = toArray(s);
        String str = substringUsingLoop(s);

        System.out.print("The strings are ");
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] != str.charAt(i)) {
                System.out.print("not ");
                break;
            }
        }
        System.out.print("equal");
		
		//closing scanner
        sc.close();
    }
}
