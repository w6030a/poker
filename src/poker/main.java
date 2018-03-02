package poker;

public class main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		Card temp = null;
		int cardNum = 1;
		while((temp = deck.getNextCard()) != null) {
			System.out.println(String.format("[%2d] = Suit: [%7s] Value: [%2s]", cardNum++, temp.getSuitString(), temp.getValueString()));
		}
	}

}
