package Phone;
import java.util.Scanner;

//creating the main class
public class PhoneDetails {
    public static void main(String[] args) {

        //creating the object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the brand of mobile phone");
        String brand = sc.nextLine();

        System.out.println("Enter the model of mobile phone");
        String model = sc.nextLine();

        System.out.println("Enter the price of the of thr  mobile phone");
        int price = sc.nextInt();

        //creating the object of class
        MobilePhone myphone = new MobilePhone(brand, model, price);

        //calling the method
        myphone.details();

        //closing the scanner
        sc.close();
    }
}
