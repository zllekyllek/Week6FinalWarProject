

// 3.	 Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
    // a)	Using the Card describe() method when each card is flipped illustrates the game play.
    // b)	Printing the winner of each turn adds interest.  
    // c)	Printing the updated score after each turn shows game progression.
    // d)	At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.

 // 2.	Create a class called App with a main method.
        // d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
    // e)	After the loop, compare the final score from each player. 
    // f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

public class App {
    public static void Main(String args[]){
        // a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
        Deck deck = new Deck();
        Player player1 = new Player("Kelly");
        Player player2 = new Player("Lonzo");

        deck.shuffle();

        // b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
        

        for(int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
            
            }
            // c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.

        }

    }
