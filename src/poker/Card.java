package poker;

public class Card {

	public static enum Suit {
		SPADE, HEART, DIAMOND, CLUB;
	}
	
	public static enum Value {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
		EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
		
		private int value;
		
		Value(int value) {
			this.value = value;
		}
		
		public int getNumbericValue() {
			return this.value;
		}
	}
	
	private Suit suit;
	private Value value;
	
	public Card (Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public Value getValue() {
		return this.value;
	}
	
	public String getSuitString() {
		return this.suit.toString();
	}
	
	public String getValueString() {
		return String.valueOf(this.value.getNumbericValue());
	}
}
