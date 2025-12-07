import java.util.*;

public class CardGame {
    public static void main(String[] args) {

        // 1. Create deck
        List<String> deck = new ArrayList<>();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Generate all 52 cards
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // 2. Shuffle the deck
        Collections.shuffle(deck);

        // 3. Pick first 5 cards
        List<String> playerHand = deck.subList(0, 5);

        // 4. Print the hand
        System.out.println("Player's 5 cards:");
        for (String card : playerHand) {
            System.out.println(card);
        }
    }
}
