import java.util.*;
import java.util.Collections;
import java.util.List;

// //b.	Deck
    // i.	Fields
        // 1.	cards (List of Card)
        
// 3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
        public class Deck {
            // ** Member Variables or Instance Variables ** //
            // private: only accessible within the class
            // ArrayList: a list of objects
        // Card: the type of object in the list
        // cards: the name of the list
        // = new ArrayList<Card>(): initialize the list
    private ArrayList<Card> cards = new ArrayList<Card>();

    // ** Constructor ** //
        // Create a new deck of cards
        public Deck() {
        // Define the suits
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        // Define the ranks
        String[] ranks = {"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "Jack", "Queen", "King", "Ace"};
        // Define values
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        

        
        // 1. Loop through the suits // Nested For Loop 
        for(int i = 0; i < suits.length; i++) {
           
            // 2. Loop through the ranks
            for(int j = 0; j < ranks.length; j++) {
                
                // 3. Create a new card
                // 4. Add the card to the deck
                this.cards.add(new Card(values[j], ranks[j] + " of " + suits[i]));
            }

    }
        }
    
// ii.	Methods

    // 1.	shuffle (randomizes the order of the cards)
    public void shuffle() {
    Collections.shuffle(this.cards);
}


// 2.	draw (removes and returns the top card of the Cards field)
public Card draw() {
    // 1. Get the top card store it in a temporary variable
    Card temporaryCard = this.cards.get(0);
    // 2. Remove the top card
    cards.remove(0);
    // 3. Return the top card
    return temporaryCard;
}




}


