import java.util.Scanner;

public class LengthOfString {

    //creating the method to find the length of the string using loop
    public static int length(String str) {

        int i = 0;

        //handling the exception using try and catch
        try {
            while (true) {

                str.charAt(i);

                i++;

            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Giving an error");
        }
                return i;

    }



    //creating the main class
    public static void main(String[] args) {

        //creating the scanner object
        Scanner sc = new Scanner(System.in);

        //taking the input
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Length by creating function "+length(str));

        //calculating the length using builtin function
        System.out.println("Length using built in function is "+str.length());

        //if equal then printing true else false
        if (length(str)== str.length()) {
            System.out.println("True");
        }else System.out.println("False");

        //closing the scanner
        sc.close();
    }
}