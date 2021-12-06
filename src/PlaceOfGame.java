import java.util.ArrayList;
import java.util.Collections;

public class PlaceOfGame {

	public static void main(String[] args) {

		 // create arrayList Global 
		 ArrayList<Card> RandomeArray = new ArrayList<Card>();
		 
		 RandomeArray.add(new Card("land","white"));
		 RandomeArray.add(new Card("land","bleu"));
		 RandomeArray.add(new Card("land","black"));
		 RandomeArray.add(new Card("land","red"));
		 
		 RandomeArray.add(new Card("creature","40"));
		 RandomeArray.add(new Card("creature","30"));
		 RandomeArray.add(new Card("creature","20"));
		 RandomeArray.add(new Card("creature","10"));
		 
		 RandomeArray.add(new Card("spells","text"));
		 RandomeArray.add(new Card("spells","texttext"));
		 RandomeArray.add(new Card("spells","texttexttext"));
		 RandomeArray.add(new Card("spells","texttexttexttext"));
		 
		
		// System.out.println(RandomeArray);
		 
		 // call players 
		 
		 Player player1 = new Player("youssef",RandomeArray );
		 player1.myShuffle();
		 
		 ArrayList<Card> cardsOfPlayer1 = new ArrayList<Card>();
		 cardsOfPlayer1.addAll(player1.getCards());
		 
		 while(cardsOfPlayer1.size()>0) {
			 ArrayList<Card> oneCard = new ArrayList<Card>();
			 oneCard.add(cardsOfPlayer1.get(0));
			 cardsOfPlayer1.remove(0);
			 
			 System.out.println(oneCard);
		 }
		 
		 
		
		 
		
	} 

}
