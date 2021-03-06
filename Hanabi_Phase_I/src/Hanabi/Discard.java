package Hanabi;

/**
 * Discard deck, containing the cards discarded by the players.
 */
public class Discard extends Cards {

	public Discard() {
		super();
	}

	/**
	 * When a card is discarded from a player's hand, it will be added to the discard's deck
	 * @param card Card to be discarded, chosen by the player
	 */
	public void addCardToDiscard(Card card)
	{
		deck.add(card);
	}
}
