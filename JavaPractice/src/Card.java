/**
 * The card class contains the following pieces of data about a playing card:
 * rank (stored as an integer 1-13), and suit (stored as a String).  This
 * information is private to the class.  Clients can obtain this information
 * only by using the various methods defined by the class.
 */

public class Card {

// Private constants
	
	private static final String CLUBS = "CLUBS";
	
	private static final String DIAMONDS = "DIAMONDS";
	
	private static final String HEARTS = "HEARTS";
	
	private static final String SPADES = "SPADES";
	
	private static final int ACE = 1;
	
	private static final int JACK = 11;
	
	private static final int QUEEN = 12;
	
	private static final int KING = 13;
	
	/**
	 * Creates a new Card object with the specified rank and suit.
	 * @param rank The card's rank as an integer 1 - 13
	 * @param suit The card's suit as a String
	 */
	public Card(int rank, String suit) {
		cardRank = rank;
		cardSuit = suit;
	}
	
	/**
	 * Gets the rank of this card.
	 * @return The rank of this card
	 */
	public String getRank() {
		switch (cardRank) {
			case 1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default: return ("" + cardRank);
		}
	}
	
	/**
	 * Gets the suit of this card.
	 * @return The suit of this card
	 */
	public String getSuit() {
		return cardSuit;
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
	
	private String cardSuit; // All caps String of the card's suit
	
}
