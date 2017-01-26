import java.util.*;

/**
 * Write a description of class PileofCards here.
 * 
 * @colinbowen 
 * @0.1
 */
public class PileOfCards
{
    private ArrayList<Card> deckCards;
    private Suit suit;
    private Value value;
    private Random randomGenerator;
    private Card Card;
    private int cardsLeft;
    private Card answer;

    /**
     * Constructor for objects of class PileofCards.
     */
    public PileOfCards()
    {
        cardsLeft = 52;
        deckCards = new ArrayList<Card>();
        randomGenerator = new Random();
    }

    /**
     * Create one of each of the 52 cards in a standard deck of cards.
     */
    public void createFullDeck()
    {
        for (Suit suit : Suit.values())
            for (Value value : Value.values())
                deckCards.add(new Card(suit, value));

    }

    /**
     * Reorganises the cards into a random order. 
     */
    public void shuffle()
    {
        ArrayList<Card> shuffleCards = new ArrayList<Card> (deckCards);
        deckCards.clear();
        for(int i=0; i<52; i++){
            int index = randomGenerator.nextInt(shuffleCards.size());
            deckCards.add(shuffleCards.get(index));
            shuffleCards.remove(index);
        }
    }

    /**
     * Removes the top card from the stack and returns it.
     */
    public Card dealTopCard()
    {
        if(cardsLeft > 0 )
        {
            Card answer = deckCards.get(0);
            deckCards.remove(0);
            return answer;
        }
        return answer;
    }
    
    
    /**
     * Checks to see if there are any cards in the stack.Returns true
     * if and only if there are no cards in the stack.
     */
    public boolean isEmpty()
    {
        boolean empty;
        if(deckCards.isEmpty())
        {
            empty = true;
        }
        else
        {
            empty = false;
        }
        return empty;
    }

    /**
     * Returns a String listing all of the cards in the stack in order.
     */
    public String toString()
    {
        return deckCards.toString();
    }
}
