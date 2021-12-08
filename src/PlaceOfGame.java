import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

public class PlaceOfGame {

	public static void main(String[] args) {

		// create arrayList Global
		ArrayList<Card> RandomeArray = new ArrayList<Card>();

		RandomeArray.add(new Card("land", "white", 60));
		RandomeArray.add(new Card("land", "bleu",  50));
		RandomeArray.add(new Card("land", "black", 30));
		RandomeArray.add(new Card("land", "red",   20));

		RandomeArray.add(new Card("creature", "40" , 40));
		RandomeArray.add(new Card("creature", "30" , 30));
		RandomeArray.add(new Card("creature", "20" , 20));
		RandomeArray.add(new Card("creature", "10" , 10));

		RandomeArray.add(new Card("spell", "text",1));
		RandomeArray.add(new Card("spell", "texttext",2));
		RandomeArray.add(new Card("spell", "texttexttext",3));
		RandomeArray.add(new Card("spell", "texttexttexttext",4));

		// call players

		Player player1 = new Player("youssef", RandomeArray);
		player1.myShuffle();
		ArrayList<Card> cardsForYoussef = new ArrayList<Card>();
		cardsForYoussef.addAll(RandomeArray);
		System.out.println(cardsForYoussef);

		Player player2 = new Player("abdo", RandomeArray);
		player2.myShuffle();
		ArrayList<Card> cardsForAbdo = new ArrayList<Card>();
		cardsForAbdo.addAll(RandomeArray);
		System.out.println(cardsForAbdo);
		// change to array of string

		// compare two objects
		int scoreForPlayer1 = 0;
		int scoreForPlayer2 = 0;
		for (int i = 0; i < 12; i++) {

			Card youssef = cardsForYoussef.get(i);
			Card abdo = cardsForAbdo.get(i);

			if (!youssef.getName().equals(abdo.getName())) {

				if (youssef.getName().equals("spell")) {
					scoreForPlayer1++;
				} else if (youssef.getName().equals("creature") && !abdo.getName().equals("spell")) {
					scoreForPlayer1++;
				} else if (abdo.getName().equals("creature") && !youssef.getName().equals("spell")) {
					scoreForPlayer1++;
				} else {
					scoreForPlayer2++;
				}

			} else {
				// count length
				if (youssef.getName().equals("spell") && abdo.getName().equals("spell")) {
					int YousssefLength = youssef.getValue().length();
					int AbdoLength = abdo.getValue().length();
					if (YousssefLength > AbdoLength) {
						scoreForPlayer1++;
					} else {
						scoreForPlayer2++;
					}
			    // count integer 
				} else if (youssef.getName().equals("creature") && abdo.getName().equals("creature")) {
					if(youssef.getPoint() == abdo.getPoint()) {
						scoreForPlayer1++;
						scoreForPlayer2++;
					}
					else if(youssef.getPoint()>abdo.getPoint()) {
						scoreForPlayer1++;
					}else {
						scoreForPlayer2++;
					}
                // count color
				} else if (youssef.getName().equals("land") && abdo.getName().equals("land")) {
					if(youssef.getPoint() == abdo.getPoint()) {
						scoreForPlayer1++;
						scoreForPlayer2++;
					}
					else if(youssef.getPoint()>abdo.getPoint()) {
						scoreForPlayer1++;
					}else {
						scoreForPlayer2++;
					}
				}
					
			}
			
		

		}
		if(scoreForPlayer1>scoreForPlayer2) {
			System.out.println("the person who is win is : youssef");
		}else if(scoreForPlayer2>scoreForPlayer1) {
			System.out.println("the person who is win is : Abdo");
		}else {
			System.out.println("no one win !!");
		}

	}

}
