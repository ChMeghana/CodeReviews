package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility2 {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        Collections.shuffle(deck);

        List<String> playerHand = deck.subList(0, 5);

        System.out.println("Player's hand: " + playerHand);
    }
}
