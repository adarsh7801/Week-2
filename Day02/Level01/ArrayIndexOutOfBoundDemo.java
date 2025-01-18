import java.util.Scanner;

public class ArrayIndexOutOfBoundDemo {

    // Method to access array element by index
    public static int generateException(int arr[], int e) {
        return arr[e];
    }

    // Method to handle exception and return a message
    public static String handellingException(int arr[], int e) {
        try {
            int value = generateException(arr, e);
            return "Element at index " + e + " is: " + value;
        } catch (ArrayIndexOutOfBoundsException ex) {
            return "Error: Index " + e + " is out of bounds for the array.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int l = sc.nextInt();
        int[] arr = new int[l];

        System.out.println("Enter " + l + " elements of the array:");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index of the element to access:");
        int e = sc.nextInt();

        // Call the method to handle exception and print result
        System.out.println(handellingException(arr, e));

        sc.close();
    }
}
