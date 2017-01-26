import java.util.*;

/**
 * Write a description of class Card here.
 * 
 * @colinbowen
 * @0.1
 */
public class Card
{
    // instance variables - replace the example below with your own
    private Suit suit;
    private Value value;    

    /**
     * Constructor for objects of class Card
     */
    public Card()
    {
        // initialise instance variables
        this.suit = suit;
        this.value = value;
    }
    
    /**
     * Constructor for the card. Takes a suit and value as a parameter.
     */
    public Card(Suit suit, Value value)
    {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Return the suit of the card.
     */
    public Suit getSuit()
    {
        return suit;
    }
    
    /**
     * Return the value of the card.
     */
    public Value getValue()
    {
        return value;
    }
    
    /**
     * Return the card details in the form Value + of + Suit.
     */
    public String toString()
    {
        return value + " of " + suit;
    }
}    
