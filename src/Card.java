import java.util.*;
import java.util.ArrayList;
import java.util.List;

// a.	Card

//i.	Fields
//1.	value (contains a value from 2-14 representing cards 2-Ace)
//2.	name (e.g. Ace of Diamonds, or Two of Hearts)
// List<Card> card = new ArrayList<Card>(); 
// private static final String[] value ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
// private static final String[] name ={"Diamonds", "Hearts", "Spades", "Clubs"};

public class Card {
    // member variables
    private int value;
    private String name;
    // constructor
    public Card(int value, String name){
        this.value = value;
        this.name = name;
    }
    // methods

    // ** Value Getter ** //
    // public: allows the method to be accessed outside of this class
    // int: tells the function that the return type is of type: int
    public int getValue() {
            return this.value;
    }
    public String getName() {
        return this.name;
    }

    // ** Setter ** //
    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
            this.name = name;
    }

    public void describe() {
        System.out.println();
    }

}







