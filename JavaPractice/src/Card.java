/**
 * The card class contains the following pieces of data about a playing card:
 * rank (stored as an integer 1-13), and suit (stored as a String).  This
 * information is private to the class.  Clients can obtain this information
 * only by using the various methods defined by the class.
 */

public class Card {

// Private constants
	
	private static final int CLUBS = 1;
	
	private static final int DIAMONDS = 2;
	
	private static final int HEARTS = 3;
	
	private static final int SPADES = 4;
	
	private static final int ACE = 1;
	
	private static final int JACK = 11;
	
	private static final int QUEEN = 12;
	
	private static final int KING = 13;
	
	/**
	 * Creates a new Card object with the specified rank and suit.
	 * @param rank The card's rank as an integer 1 - 13
	 * @param suit The card's suit as a String
	 */
	public Card(int rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
	}
	
	/**
	 * Gets the rank of this card.
	 * @return The rank of this card
	 */
	public String getRank() {
		switch (cardRank) {
			case ACE: return "Ace";
			case JACK: return "Jack";
			case QUEEN: return "Queen";
			case KING: return "King";
			default: return Integer.toString(cardRank);
		}
	}
	
	/**
	 * Gets the suit of this card.
	 * @return The suit of this card
	 */
	public String getSuit() {
		switch (cardSuit) {
			case CLUBS: return "Clubs";
			case DIAMONDS: return "Diamonds";
			case HEARTS: return "Hearts";
			case SPADES: return "Spades";
			default: return "no suit";
		}
	}
	
	/**
	 * Creates a string identifying this card.
	 * @return The string used to display this card
	 */
	public String toString() {
		return getRank() + " of " + getSuit();
	}
	
// Private instance variables
	
	private int cardRank; // The integer rank of the card, 1 - 13
	
	private int cardSuit; // Keeps track of the card object's suit
	
}
