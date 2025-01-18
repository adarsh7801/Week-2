import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = ' ';
        int maxCount = 0;

        for (char c : freqMap.keySet()) {
            if (freqMap.get(c) > maxCount) {
                mostFrequent = c;
                maxCount = freqMap.get(c);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
