import java.util.ArrayList;
import java.util.List;



// c.	Player
    // i.	Fields
        // 1.	hand (List of Card)
        // 2.	score (set to 0 in the constructor)
        // 3.	name

public class Player { 
    private List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    
    // ii.	Methods
    
    // 1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
    public void describe() {
        System.out.println(this.name);
        System.out.println(this.score);
        for(int i = 0; i < hand.size(); i++){
            hand.get(i).describe();
        }
    }

        // 2.	flip (removes and returns the top card of the Hand)
    public Card flip() {
        Card temporaryCard = this.hand.get(0);
        this.hand.remove(0);
        return temporaryCard;
    }

        // 3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
    public void draw(Deck deck) {
        this.hand.add(deck.draw());
    }
        // 4.	incrementScore (adds 1 to the Player’s score field)
    public void incrementScore() {
        this.score = this.score + 1;
    }
    public int getScore() {
        return this.score;
    }
    
    
}

    