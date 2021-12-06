import java.util.ArrayList;
import java.util.Collections;

public class Player {

	private String playerName;
	private ArrayList<Card> Mycards;

	public Player(String NewPlayer, ArrayList<Card> NewCards) {
		this.setPlayerName(NewPlayer);
		this.setCards(NewCards);

	}

	// getter and setter for PlayName
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	// getter and setter for cards
	public ArrayList<Card> getCards() {
		return this.Mycards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.Mycards = cards;
	}

	// create method for shuffle
	public void myShuffle() {
		Collections.shuffle(this.getCards());
		
	}
	
	// create a method for dropping a card
	

}
