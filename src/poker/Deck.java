package poker;

import java.util.concurrent.ThreadLocalRandom;

import poker.Card.Suit;
import poker.Card.Value;

public class Deck {
	public static final int NUM_OF_CARDS = 52;
	public static final int SHUFFLE_RANDOM_ROUND_MIN = 1;
	public static final int SHUFFLE_RANDOM_ROUND_MAX = 100;

	private int index;
	private Card[] Cards;
	
	{
		this.index = 0;
		this.Cards = new Card[NUM_OF_CARDS];
	}
	
	public Deck() {
		createCards();
		shuffle();
	}
	
	public Card getNextCard() {
		if(index > NUM_OF_CARDS-1) {
			return null;
		}
		
		return Cards[index++];
	}
	
	private void createCards() {
		int index = 0;
		for(Suit suit: Card.Suit.values()) {
			for(Value value: Card.Value.values()) {
				Cards[index] = new Card(suit, value);
				index++;
			}
		}
	}
	
	private void shuffle() {
		int round = ThreadLocalRandom.current().nextInt(SHUFFLE_RANDOM_ROUND_MIN, SHUFFLE_RANDOM_ROUND_MAX);
		for(;round > 0; round--) {
			for(int i = 0; i < Cards.length; i++) {
				int swapIndex = ThreadLocalRandom.current().nextInt(0, NUM_OF_CARDS);
				swapCards(i, swapIndex);
			}			
		}
	}
	
	private void swapCards(int index1, int index2) {
		if(index1 == index2) {
			return;
		}
		
		Card temp = Cards[index1];
		Cards[index1] = Cards[index2];
		Cards[index2] = temp;
	}
}
