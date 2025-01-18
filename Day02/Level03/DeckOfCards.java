import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards * numPlayers > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute.");
        }

        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Get user inputs for number of players and cards
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int numCards = scanner.nextInt();

        try {
            // Distribute cards and print the results
            String[][] players = distributeCards(deck, numCards, numPlayers);
            printPlayersCards(players);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
